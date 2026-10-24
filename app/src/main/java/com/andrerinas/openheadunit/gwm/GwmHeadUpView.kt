package com.andrerinas.openheadunit.gwm

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.view.View
import androidx.core.content.ContextCompat
import com.andrerinas.openheadunit.R
import com.andrerinas.openheadunit.hud.BydGuidance
import com.andrerinas.openheadunit.hud.ClusterTurnCardView

/**
 * The GWM head-up display's arrow area: turn arrow, distance to the turn and arrival time, only
 * while a route is active. The car already projects speed and its own readouts, and apps can only
 * draw in the arrow area, so nothing else is drawn and the background stays transparent.
 * Adapted from DiPlay's GwmHeadUpView (jollyboy95/d-play-gwm-h7 @ 1460810, GPL-3.0-or-later).
 */
internal class GwmHeadUpView(context: Context) : View(context) {
    enum class Anchor { LEFT, CENTRE, RIGHT }

    private var guidance: BydGuidance? = null
    private var anchor = Anchor.CENTRE

    private val distancePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE
        typeface = Typeface.create("sans-serif", Typeface.BOLD)
    }
    private val etaPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE
        typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
    }
    private val etaLabelPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.rgb(160, 172, 188)
        typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
    }
    private val arrowTint = Color.rgb(90, 200, 250)
    private var glyph: Drawable? = null
    private var glyphRes = 0

    fun setGuidance(next: BydGuidance?) {
        if (next == guidance) return
        guidance = next
        invalidate()
    }

    fun setAnchor(next: Anchor) {
        if (next == anchor) return
        anchor = next
        invalidate()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val next = guidance ?: return
        val w = width.toFloat()
        val h = height.toFloat()
        if (w <= 0f || h <= 0f) return
        val distance = GwmFormat.distance(context, next.distanceMeters)
        val eta = GwmFormat.arrival(next)
        // A small, squarish arrow area gets the stacked layout.
        if (w < h * 2.2f) drawStacked(canvas, next, distance, eta, w, h) else drawRow(canvas, next, distance, eta, w, h)
    }

    private fun drawRow(canvas: Canvas, next: BydGuidance, distance: String, eta: String?, w: Float, h: Float) {
        val unit = h * 0.5f
        distancePaint.textSize = unit * 0.62f
        etaPaint.textSize = unit * 0.40f
        etaLabelPaint.textSize = unit * 0.24f
        val arrow = unit * 0.95f
        val gap = unit * 0.28f
        val etaLabel = context.getString(R.string.gwm_hud_arrival)
        val textW = distancePaint.measureText(distance)
        val etaW = eta?.let { maxOf(etaPaint.measureText(it), etaLabelPaint.measureText(etaLabel)) + gap * 2f } ?: 0f
        val rowW = arrow + gap + textW + etaW
        val left = when (anchor) {
            Anchor.LEFT -> h * 0.15f
            Anchor.CENTRE -> (w - rowW) / 2f
            Anchor.RIGHT -> w - rowW - h * 0.15f
        }.coerceIn(0f, (w - rowW).coerceAtLeast(0f))
        val midY = h / 2f
        drawArrow(canvas, next, left, midY - arrow / 2f, arrow)
        val textLeft = left + arrow + gap
        canvas.drawText(distance, textLeft, midY + unit * 0.22f, distancePaint)
        eta?.let {
            val etaLeft = textLeft + textW + gap * 2f
            canvas.drawText(etaLabel, etaLeft, midY - unit * 0.18f, etaLabelPaint)
            canvas.drawText(it, etaLeft, midY + unit * 0.30f, etaPaint)
        }
    }

    /** Arrow on top, distance under it, arrival time last; everything centred and sized to fit. */
    private fun drawStacked(canvas: Canvas, next: BydGuidance, distance: String, eta: String?, w: Float, h: Float) {
        val lines = if (eta != null) 3.0f else 2.3f
        val unit = minOf(h / lines, w * 0.62f)
        val arrow = unit * 1.05f
        val total = arrow + unit * 0.75f + (if (eta != null) unit * 0.55f else 0f)
        var y = (h - total) / 2f
        val cx = w / 2f
        drawArrow(canvas, next, cx - arrow / 2f, y, arrow)
        y += arrow
        distancePaint.textSize = unit * 0.55f
        distancePaint.textAlign = Paint.Align.CENTER
        canvas.drawText(ellipsize(distance, w * 0.96f, distancePaint), cx, y + unit * 0.62f, distancePaint)
        distancePaint.textAlign = Paint.Align.LEFT
        y += unit * 0.75f
        eta?.let {
            etaPaint.textSize = unit * 0.36f
            etaPaint.textAlign = Paint.Align.CENTER
            val label = context.getString(R.string.gwm_hud_arrival)
            canvas.drawText(ellipsize("$label $it", w * 0.96f, etaPaint), cx, y + unit * 0.42f, etaPaint)
            etaPaint.textAlign = Paint.Align.LEFT
        }
    }

    private fun drawArrow(canvas: Canvas, next: BydGuidance, left: Float, top: Float, side: Float) {
        val res = ClusterTurnCardView.glyphRes(next.clusterIcon)
        if (res != glyphRes) {
            glyph = ContextCompat.getDrawable(context, res)?.mutate()?.apply { setTint(arrowTint) }
            glyphRes = res
        }
        glyph?.setBounds(left.toInt(), top.toInt(), (left + side).toInt(), (top + side).toInt())
        glyph?.draw(canvas)
    }

    private fun ellipsize(text: String, maxWidth: Float, paint: Paint): String {
        if (paint.measureText(text) <= maxWidth) return text
        var end = text.length
        while (end > 0 && paint.measureText(text.take(end) + "…") > maxWidth) end--
        return text.take(end) + "…"
    }
}
