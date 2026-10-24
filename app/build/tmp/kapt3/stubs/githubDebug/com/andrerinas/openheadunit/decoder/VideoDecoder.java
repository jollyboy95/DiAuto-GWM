package com.andrerinas.openheadunit.decoder;

/**
 * Main video decoding engine.
 * Handles H.264/H.265 streams via MediaCodec.
 *
 * [memoryReading] is resolved once at construction and reported with the codec configuration, so
 * that every bug report carries what the device actually has. Nothing is sized from it yet.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u0000 \u00e6\u00012\u00020\u0001:\b\u00e5\u0001\u00e6\u0001\u00e7\u0001\u00e8\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J$\u0010\u009d\u0001\u001a\u00020d2\u0007\u0010\u009e\u0001\u001a\u00020P2\u0007\u0010\u009f\u0001\u001a\u00020\b2\u0007\u0010\u00a0\u0001\u001a\u00020\u0015H\u0002J$\u0010\u00a1\u0001\u001a\u00020d2\u0007\u0010\u00a2\u0001\u001a\u00020\b2\u0007\u0010\u00a3\u0001\u001a\u00020\b2\u0007\u0010\u00a0\u0001\u001a\u00020\u0015H\u0002J\u0012\u0010\u00a4\u0001\u001a\u00020&2\u0007\u0010\u00a5\u0001\u001a\u00020\bH\u0002J.\u0010\u00a6\u0001\u001a\u00030\u00a7\u00012\u0007\u0010\u00a8\u0001\u001a\u00020\u00132\u0007\u0010\u00a2\u0001\u001a\u00020\b2\u0007\u0010\u00a3\u0001\u001a\u00020\b2\u0007\u0010\u00a9\u0001\u001a\u00020\u0013H\u0002J\t\u0010\u00aa\u0001\u001a\u00020\u000eH\u0002J\t\u0010\u00ab\u0001\u001a\u00020dH\u0002J\u001b\u0010\u00ac\u0001\u001a\u00020\b2\u0007\u0010\u00ad\u0001\u001a\u00020\b2\u0007\u0010\u00ae\u0001\u001a\u00020\bH\u0002J4\u0010\u00af\u0001\u001a\u00020d2\u0007\u0010\u00ae\u0001\u001a\u00020P2\u0007\u0010\u00b0\u0001\u001a\u00020\b2\u0007\u0010\u00a5\u0001\u001a\u00020\b2\u0007\u0010\u00b1\u0001\u001a\u00020\u000e2\u0007\u0010\u00b2\u0001\u001a\u00020\u0013J$\u0010\u00b3\u0001\u001a\u00020\u00132\u0007\u0010\u009e\u0001\u001a\u00020P2\u0007\u0010\u009f\u0001\u001a\u00020\b2\u0007\u0010\u00b4\u0001\u001a\u00020\u000eH\u0002J&\u0010\u00b5\u0001\u001a\u0004\u0018\u00010\u00152\u0007\u0010\u00ae\u0001\u001a\u00020P2\u0007\u0010\u00b0\u0001\u001a\u00020\b2\u0007\u0010\u00a5\u0001\u001a\u00020\bH\u0002J \u0010\u00b6\u0001\u001a\u000f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00b7\u00012\b\u0010\u00b8\u0001\u001a\u00030\u00a7\u0001H\u0002J$\u0010\u00b9\u0001\u001a\u00020d2\u0007\u0010\u00ba\u0001\u001a\u00020P2\u0007\u0010\u00bb\u0001\u001a\u00020\b2\u0007\u0010\u00a5\u0001\u001a\u00020\bH\u0002J\u001c\u0010\u00bc\u0001\u001a\u00030\u00bd\u00012\u0007\u0010\u00ae\u0001\u001a\u0002082\u0007\u0010\u00be\u0001\u001a\u00020*H\u0002J\t\u0010\u00bf\u0001\u001a\u00020dH\u0002J\u001d\u0010\u00c0\u0001\u001a\u0004\u0018\u00010\u00132\u0007\u0010\u00a8\u0001\u001a\u00020\u00132\u0007\u0010\u00c1\u0001\u001a\u00020\u000eH\u0002J@\u0010\u00c2\u0001\u001a\u00020d2\u0007\u0010\u00ae\u0001\u001a\u00020P2\u0007\u0010\u00b0\u0001\u001a\u00020\b2\u0007\u0010\u00a5\u0001\u001a\u00020\b2\u001a\u0010\u00c3\u0001\u001a\u0015\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020d0\u00c4\u0001H\u0002J\u0013\u0010\u00c5\u0001\u001a\u00020d2\b\u0010\u00b8\u0001\u001a\u00030\u00a7\u0001H\u0002J\u0007\u0010\u00c6\u0001\u001a\u00020\u000eJ\u0010\u0010\u00c7\u0001\u001a\u00020\u000e2\u0007\u0010\u00c8\u0001\u001a\u00020\\J\u0013\u0010\u00c9\u0001\u001a\u00020\u000e2\b\u0010\u00ca\u0001\u001a\u00030\u00cb\u0001H\u0002J-\u0010\u00cc\u0001\u001a\u00020d2\u0007\u0010\u00b2\u0001\u001a\u00020\u00132\u0007\u0010\u00a8\u0001\u001a\u00020\u00132\u0007\u0010\u00a2\u0001\u001a\u00020\b2\u0007\u0010\u00a3\u0001\u001a\u00020\bH\u0002J\u0012\u0010\u00cd\u0001\u001a\u00020d2\u0007\u0010\u00ce\u0001\u001a\u00020\u0013H\u0002J\t\u0010\u00cf\u0001\u001a\u00020dH\u0002J\t\u0010\u00d0\u0001\u001a\u00020dH\u0002J\u0012\u0010\u00d1\u0001\u001a\u00020d2\u0007\u0010\u00d2\u0001\u001a\u00020\bH\u0002J\t\u0010\u00d3\u0001\u001a\u00020dH\u0002J\u0012\u0010\u00d4\u0001\u001a\u00020d2\u0007\u0010\u00d5\u0001\u001a\u00020&H\u0002J#\u0010\u00d6\u0001\u001a\u00020d2\u0007\u0010\u00d7\u0001\u001a\u00020*2\u0006\u0010:\u001a\u00020*2\u0007\u0010\u00d8\u0001\u001a\u00020*H\u0002J\u0012\u0010\u00d9\u0001\u001a\u00020d2\u0007\u0010\u00da\u0001\u001a\u00020SH\u0002J-\u0010\u00db\u0001\u001a\u00020d2\u0007\u0010\u00ae\u0001\u001a\u00020P2\u0007\u0010\u00b0\u0001\u001a\u00020\b2\u0007\u0010\u00a5\u0001\u001a\u00020\b2\u0007\u0010\u00a0\u0001\u001a\u00020\u0015H\u0002J\u0011\u0010\u00dc\u0001\u001a\u00020d2\u0006\u0010c\u001a\u00020\u0013H\u0002J\u0012\u0010\u00dd\u0001\u001a\u00020d2\t\u0010\u00c8\u0001\u001a\u0004\u0018\u00010\\J\u001b\u0010\u00de\u0001\u001a\u00020\u000e2\u0007\u0010\u00a0\u0001\u001a\u00020\u00152\u0007\u0010\u00b1\u0001\u001a\u00020\u000eH\u0002J-\u0010\u00df\u0001\u001a\u00020d2\u0007\u0010\u00a8\u0001\u001a\u00020\u00132\u0007\u0010\u00b1\u0001\u001a\u00020\u000e2\u0007\u0010\u00a2\u0001\u001a\u00020\b2\u0007\u0010\u00a3\u0001\u001a\u00020\bH\u0002J\u001b\u0010\u00e0\u0001\u001a\u00020d2\u0007\u0010\u00a2\u0001\u001a\u00020\b2\u0007\u0010\u00a3\u0001\u001a\u00020\bH\u0002J\u0011\u0010\u00e1\u0001\u001a\u00020d2\b\b\u0002\u0010c\u001a\u00020\u0013J\u0018\u0010\u00e2\u0001\u001a\u00020\u000e2\u0007\u0010\u00c8\u0001\u001a\u00020\\2\u0006\u0010c\u001a\u00020\u0013J$\u0010\u00e3\u0001\u001a\u00020d2\u0007\u0010\u00e4\u0001\u001a\u00020P2\u0007\u0010\u00b0\u0001\u001a\u00020\b2\u0007\u0010\u00a5\u0001\u001a\u00020\bH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\'\u001a\b\u0012\u0004\u0012\u00020&0%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u000e\u00102\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u00103\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b4\u00105R\u0018\u00106\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u00109R\u000e\u0010:\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010@\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010/\"\u0004\bB\u00101R\u001a\u0010C\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010/\"\u0004\bE\u00101R\u000e\u0010F\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010O\u001a\u0004\u0018\u00010PX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010Q\u001a\b\u0012\u0004\u0012\u00020S0RX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010[\u001a\u0004\u0018\u00010\\X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R7\u0010_\u001a\u001f\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\f\ba\u0012\b\bb\u0012\u0004\b\b(c\u0012\u0004\u0012\u00020d\u0018\u00010`X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010i\u001a\n\u0012\u0004\u0012\u00020d\u0018\u00010jX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR(\u0010o\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020d\u0018\u00010`X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010f\"\u0004\bq\u0010hR\"\u0010r\u001a\n\u0012\u0004\u0012\u00020d\u0018\u00010jX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010l\"\u0004\bt\u0010nR\"\u0010u\u001a\n\u0012\u0004\u0012\u00020d\u0018\u00010jX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010l\"\u0004\bw\u0010nR\"\u0010x\u001a\n\u0012\u0004\u0012\u00020d\u0018\u00010jX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010l\"\u0004\bz\u0010nR\u0010\u0010{\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020}X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010~\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u007f\u001a\u00030\u0080\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010PX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0082\u0001\u001a\u00030\u0083\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0084\u0001\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0085\u0001\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0086\u0001\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0087\u0001\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0088\u0001\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008c\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0011\u0010\u0091\u0001\u001a\u0004\u0018\u00010PX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0092\u0001\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0093\u0001\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0094\u0001\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0095\u0001\u001a\u00020\u000e8F\u00a2\u0006\u0007\u001a\u0005\b\u0096\u0001\u00105R\u0014\u0010\u0097\u0001\u001a\u00020\b8F\u00a2\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0014\u0010\u009a\u0001\u001a\u00020\b8F\u00a2\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u0099\u0001R\u0011\u0010\u009c\u0001\u001a\u0004\u0018\u00010PX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00e9\u0001"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/VideoDecoder;", "", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "memoryReading", "Lcom/andrerinas/openheadunit/decoder/DeviceMemoryReading;", "(Lcom/andrerinas/openheadunit/utils/Settings;Lcom/andrerinas/openheadunit/decoder/DeviceMemoryReading;)V", "backpressureWindows", "", "codec", "Landroid/media/MediaCodec;", "codecBufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "codecConfigured", "", "codecFallbackUsed", "codecTypePinned", "constrained", "currentCodecName", "", "currentCodecType", "Lcom/andrerinas/openheadunit/decoder/VideoDecoder$CodecType;", "decoderCapability", "Lcom/andrerinas/openheadunit/decoder/DecoderCapabilityReport$Capability;", "decoderNeedsRestart", "decoderPermanentlyFailed", "decoderRestartReason", "dimensionsListener", "Lcom/andrerinas/openheadunit/decoder/VideoDimensionsListener;", "getDimensionsListener", "()Lcom/andrerinas/openheadunit/decoder/VideoDimensionsListener;", "setDimensionsListener", "(Lcom/andrerinas/openheadunit/decoder/VideoDimensionsListener;)V", "feedThread", "Ljava/lang/Thread;", "frameCount", "framePool", "Ljava/util/concurrent/ArrayBlockingQueue;", "Lcom/andrerinas/openheadunit/decoder/VideoDecoder$PendingFrame;", "frameQueue", "frameQueueCapacity", "framesDropped", "", "framesFed", "framesRendered", "framesRenderedThisSession", "getFramesRenderedThisSession", "()J", "setFramesRenderedThisSession", "(J)V", "framesSkippedAtRender", "hasRenderedThisSession", "getHasRenderedThisSession", "()Z", "inputBuffers", "", "Ljava/nio/ByteBuffer;", "[Ljava/nio/ByteBuffer;", "inputWaitMs", "keyframeRepair", "Lcom/andrerinas/openheadunit/decoder/KeyframeRepairTracker;", "lastDropKeyframeRequestMs", "lastFeedDropLogMs", "lastFpsLogTime", "lastFrameRenderedMs", "getLastFrameRenderedMs", "setLastFrameRenderedMs", "lastInputBytesReceivedMs", "getLastInputBytesReceivedMs", "setLastInputBytesReceivedMs", "lastKeyframeStarvedAskMs", "lastLoggedFramesDropped", "lastLoggedFramesFed", "lastLoggedFramesRendered", "lastLoggedFramesSkippedAtRender", "lastLoggedInputWaitMs", "lastSyncStallRestartMs", "lastSyncStallSuppressedLogMs", "lastThroughputLogMs", "legacyFrameBuffer", "", "loggedContentKinds", "Ljava/util/HashSet;", "Lcom/andrerinas/openheadunit/aap/CodecConfigScanner$Content;", "loggedDecoderCapability", "loggedFirstHardwareFrame", "loggedFirstSoftwareFrame", "loggedInputBufferCapacity", "loggedParameterSet", "loggedUnusableOutputTimestamps", "mHeight", "mSurface", "Landroid/view/Surface;", "mWidth", "minPooledFrameBytes", "onDecoderError", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "reason", "", "getOnDecoderError", "()Lkotlin/jvm/functions/Function1;", "setOnDecoderError", "(Lkotlin/jvm/functions/Function1;)V", "onFirstFrameListener", "Lkotlin/Function0;", "getOnFirstFrameListener", "()Lkotlin/jvm/functions/Function0;", "setOnFirstFrameListener", "(Lkotlin/jvm/functions/Function0;)V", "onFpsChanged", "getOnFpsChanged", "setOnFpsChanged", "onFrameDropped", "getOnFrameDropped", "setOnFrameDropped", "onKeyframeObserved", "getOnKeyframeObserved", "setOnKeyframeObserved", "onKeyframeStarved", "getOnKeyframeStarved", "setOnKeyframeStarved", "outputThread", "parameterSetTracker", "Lcom/andrerinas/openheadunit/decoder/ParameterSetTracker;", "pooledByteBudget", "pooledBytes", "Ljava/util/concurrent/atomic/AtomicInteger;", "pps", "readyIndices", "", "renderedThisSession", "reportedBackpressure", "requestedMaxInputSize", "restartsSinceLastFrame", "running", "softwareHevcDecoder", "Lcom/andrerinas/openheadunit/decoder/FfmpegHevcDecoder;", "softwareYuvFrameSink", "Lcom/andrerinas/openheadunit/decoder/SoftwareYuvFrameSink;", "getSoftwareYuvFrameSink", "()Lcom/andrerinas/openheadunit/decoder/SoftwareYuvFrameSink;", "setSoftwareYuvFrameSink", "(Lcom/andrerinas/openheadunit/decoder/SoftwareYuvFrameSink;)V", "sps", "startTime", "suppressedFeedDropLogs", "syncStallRestartCount", "usingBundledSoftwareHevc", "getUsingBundledSoftwareHevc", "videoHeight", "getVideoHeight", "()I", "videoWidth", "getVideoWidth", "vps", "applyParameterSet", "nalData", "headerLen", "type", "applyStreamDimensions", "width", "height", "borrowFrame", "size", "buildFormat", "Landroid/media/MediaFormat;", "mimeType", "bestCodec", "bundledHevcSelected", "clearFrameQueue", "croppedOr", "crop", "buffer", "decode", "offset", "forceSoftware", "codecName", "describeSizeChange", "hevc", "detectCodecType", "displaySizeOf", "Lkotlin/Pair;", "format", "enqueueForFeed", "frameData", "frameOffset", "feedInputBuffer", "Lcom/andrerinas/openheadunit/decoder/VideoDecoder$FeedResult;", "arrivalNanos", "feedThreadLoop", "findBestCodec", "preferHardware", "forEachNalUnit", "callback", "Lkotlin/Function2;", "handleOutputFormatChange", "hasValidSurface", "isCurrentSurface", "surface", "isHardwareAccelerated", "info", "Landroid/media/MediaCodecInfo;", "logDecoderCapability", "logFeedDrop", "detail", "logThroughput", "notifyFrameDropped", "onSoftwareFramesRendered", "renderedFrames", "outputThreadLoop", "recycleFrame", "frame", "reportBackpressure", "elapsedMs", "dropped", "reportContentOnce", "content", "scanAndApplyConfig", "scheduleRestart", "setSurface", "shouldUseBundledHevc", "start", "startBundledHevc", "stop", "stopIfCurrentSurface", "trackParameterSets", "data", "CodecType", "Companion", "FeedResult", "PendingFrame", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class VideoDecoder {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.utils.Settings settings = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.decoder.DeviceMemoryReading memoryReading = null;
    private static final long TIMEOUT_US = 10000L;
    private static final int MAX_RESTARTS_WITHOUT_FRAME = 3;
    private static final long SYNC_STALL_THRESHOLD_MS = 2000L;
    private static final long SYNC_STALL_COOLDOWN_MS = 8000L;
    private static final long SYNC_STALL_RESET_MS = 60000L;
    private static final int MAX_SYNC_STALL_RESTARTS = 4;
    private static final long WARM_RECONFIGURE_FIRST_FRAME_GRACE_MS = 10000L;
    private static final long THROUGHPUT_LOG_INTERVAL_MS = 5000L;
    private static final int MAX_CATCHUP_SKIPS = 8;
    private static final long FEED_POLL_MS = 200L;
    private static final int MIN_POOLED_FRAME_BYTES = 65536;
    private static final int MIN_POOLED_FRAME_BYTES_CONSTRAINED = 16384;
    
    /**
     * Soft ceiling on the bytes the frame pool may retain, on a constrained device only.
     *
     * The pool holds capacity+2 buffers and each grows to the largest frame it has ever held,
     * never shrinking, so a pool that has seen a few keyframes settles at tens of slots times
     * keyframe size - several megabytes on a device whose whole heap is twenty. This bounds that
     * without touching the queue depth, which is load-bearing (see VideoFeedQueuePolicy): a
     * buffer that would push the pool past the ceiling is simply not kept, and the next frame
     * that needs one allocates it again.
     *
     * 2MB holds every slot at the constrained floor with room left for several keyframe-sized
     * buffers, so the steady state stays pooled and only the largest ones churn.
     */
    private static final int CONSTRAINED_POOL_BUDGET_BYTES = 2097152;
    
    /**
     * Spacing of the per-frame input-buffer-full report. The throughput line carries the rate.
     */
    private static final long FEED_DROP_LOG_INTERVAL_MS = 1000L;
    private static final long SYNC_STALL_SUPPRESSED_LOG_INTERVAL_MS = 10000L;
    private static final int MAX_ALIGNMENT_PADDING = 64;
    private static final int MIN_PLAUSIBLE_DIMENSION = 160;
    private static final int MAX_PLAUSIBLE_WIDTH = 7680;
    private static final int MAX_PLAUSIBLE_HEIGHT = 4320;
    
    /**
     * Checks if ANY H.265 (HEVC) hardware decoding is present, regardless of reliability.
     * Used for MANUAL codec selection (User override).
     */
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile java.lang.Boolean cachedHwHevcSupported;
    @org.jetbrains.annotations.Nullable()
    private android.media.MediaCodec codec;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.decoder.FfmpegHevcDecoder softwareHevcDecoder;
    @org.jetbrains.annotations.Nullable()
    private android.media.MediaCodec.BufferInfo codecBufferInfo;
    @org.jetbrains.annotations.Nullable()
    private android.view.Surface mSurface;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Thread outputThread;
    @kotlin.jvm.Volatile()
    private volatile boolean running = false;
    private long startTime = 0L;
    private int mWidth = 0;
    private int mHeight = 0;
    @org.jetbrains.annotations.Nullable()
    private byte[] vps;
    @org.jetbrains.annotations.Nullable()
    private byte[] sps;
    @org.jetbrains.annotations.Nullable()
    private byte[] pps;
    @kotlin.jvm.Volatile()
    private volatile boolean codecConfigured = false;
    @org.jetbrains.annotations.NotNull()
    private com.andrerinas.openheadunit.decoder.VideoDecoder.CodecType currentCodecType = com.andrerinas.openheadunit.decoder.VideoDecoder.CodecType.H264;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentCodecName;
    private boolean codecTypePinned = false;
    private boolean loggedParameterSet = false;
    private int requestedMaxInputSize = 0;
    private boolean loggedInputBufferCapacity = false;
    private boolean loggedDecoderCapability = false;
    
    /**
     * What the component claimed at configure time, kept so the backpressure line can quote it.
     *
     * "The codec is the bottleneck" and "the codec said it could do this" are only worth anything
     * together: the first without the second reads as a slow device, and the pair says the profile
     * we negotiated was never one this hardware could carry.
     */
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.decoder.DecoderCapabilityReport.Capability decoderCapability;
    
    /**
     * Windows that both shed frames and spent a large share waiting - see [VideoBackpressurePolicy].
     */
    private int backpressureWindows = 0;
    private boolean reportedBackpressure = false;
    private int restartsSinceLastFrame = 0;
    private boolean codecFallbackUsed = false;
    private boolean decoderPermanentlyFailed = false;
    @kotlin.jvm.Volatile()
    private volatile boolean renderedThisSession = false;
    private int syncStallRestartCount = 0;
    private long lastSyncStallRestartMs = 0L;
    private long lastSyncStallSuppressedLogMs = 0L;
    @kotlin.jvm.Volatile()
    private volatile long framesFed = 0L;
    @kotlin.jvm.Volatile()
    private volatile long framesDropped = 0L;
    @kotlin.jvm.Volatile()
    private volatile long framesRendered = 0L;
    @kotlin.jvm.Volatile()
    private volatile long framesSkippedAtRender = 0L;
    @kotlin.jvm.Volatile()
    private volatile long inputWaitMs = 0L;
    private long lastThroughputLogMs = 0L;
    private long lastLoggedFramesFed = 0L;
    private long lastLoggedFramesDropped = 0L;
    private long lastLoggedFramesRendered = 0L;
    private long lastLoggedFramesSkippedAtRender = 0L;
    private long lastLoggedInputWaitMs = 0L;
    private final int frameQueueCapacity = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.ArrayBlockingQueue<com.andrerinas.openheadunit.decoder.VideoDecoder.PendingFrame> frameQueue = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.ArrayBlockingQueue<com.andrerinas.openheadunit.decoder.VideoDecoder.PendingFrame> framePool = null;
    private final boolean constrained = false;
    private final int minPooledFrameBytes = 0;
    private final int pooledByteBudget = 0;
    
    /**
     * Bytes currently held by [framePool]. Atomic because frames are returned from both the feed
     * thread and the transport thread, and the ceiling it guards is only useful if it is not raced
     * away.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.atomic.AtomicInteger pooledBytes = null;
    
    /**
     * Last time a per-frame drop was reported, and how many were suppressed since.
     *
     * The two drop lines below used to print once per frame, which on a saturated link is 30-60 a
     * second - and every AppLog line builds a Throwable and walks its stack to derive the caller,
     * so on a device already collecting every five seconds the reporting costs more than the thing
     * being reported. The counters in the throughput line carry the rate; these lines only need to
     * say it is happening.
     */
    private long lastFeedDropLogMs = 0L;
    private int suppressedFeedDropLogs = 0;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile java.lang.Thread feedThread;
    @org.jetbrains.annotations.NotNull()
    private final int[] readyIndices = null;
    @org.jetbrains.annotations.Nullable()
    private java.nio.ByteBuffer[] inputBuffers;
    @org.jetbrains.annotations.Nullable()
    private byte[] legacyFrameBuffer;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.decoder.VideoDimensionsListener dimensionsListener;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onFpsChanged;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.decoder.SoftwareYuvFrameSink softwareYuvFrameSink;
    private int frameCount = 0;
    private long lastFpsLogTime = 0L;
    private boolean loggedFirstSoftwareFrame = false;
    private boolean loggedFirstHardwareFrame = false;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile kotlin.jvm.functions.Function0<kotlin.Unit> onFirstFrameListener;
    @kotlin.jvm.Volatile()
    private volatile long lastFrameRenderedMs = 0L;
    @kotlin.jvm.Volatile()
    private volatile long framesRenderedThisSession = 0L;
    @kotlin.jvm.Volatile()
    private volatile long lastInputBytesReceivedMs = 0L;
    @kotlin.jvm.Volatile()
    private volatile boolean decoderNeedsRestart = false;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile java.lang.String decoderRestartReason;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onDecoderError;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onKeyframeStarved;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onFrameDropped;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onKeyframeObserved;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.decoder.KeyframeRepairTracker keyframeRepair = null;
    @kotlin.jvm.Volatile()
    private volatile long lastDropKeyframeRequestMs = 0L;
    
    /**
     * Throttle stamp for [onKeyframeStarved], on the output thread only.
     */
    private long lastKeyframeStarvedAskMs = 0L;
    
    /**
     * Said once per process: this component's output timestamps mean nothing. Not session-scoped,
     * because it is a property of the decoder rather than of the stream.
     */
    private boolean loggedUnusableOutputTimestamps = false;
    
    /**
     * Diagnostic only - see [ParameterSetTracker]. Feed-thread confined, like the scan that feeds it.
     */
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.decoder.ParameterSetTracker parameterSetTracker = null;
    
    /**
     * Config-scanner answers already reported this session, so each is said once.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashSet<com.andrerinas.openheadunit.aap.CodecConfigScanner.Content> loggedContentKinds = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.decoder.VideoDecoder.Companion Companion = null;
    
    public VideoDecoder(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.Settings settings, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.decoder.DeviceMemoryReading memoryReading) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.decoder.VideoDimensionsListener getDimensionsListener() {
        return null;
    }
    
    public final void setDimensionsListener(@org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.decoder.VideoDimensionsListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnFpsChanged() {
        return null;
    }
    
    public final void setOnFpsChanged(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.decoder.SoftwareYuvFrameSink getSoftwareYuvFrameSink() {
        return null;
    }
    
    public final void setSoftwareYuvFrameSink(@org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.decoder.SoftwareYuvFrameSink p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnFirstFrameListener() {
        return null;
    }
    
    public final void setOnFirstFrameListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    public final long getLastFrameRenderedMs() {
        return 0L;
    }
    
    public final void setLastFrameRenderedMs(long p0) {
    }
    
    public final long getFramesRenderedThisSession() {
        return 0L;
    }
    
    public final void setFramesRenderedThisSession(long p0) {
    }
    
    public final long getLastInputBytesReceivedMs() {
        return 0L;
    }
    
    public final void setLastInputBytesReceivedMs(long p0) {
    }
    
    public final boolean getUsingBundledSoftwareHevc() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnDecoderError() {
        return null;
    }
    
    public final void setOnDecoderError(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnKeyframeStarved() {
        return null;
    }
    
    public final void setOnKeyframeStarved(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnFrameDropped() {
        return null;
    }
    
    public final void setOnFrameDropped(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnKeyframeObserved() {
        return null;
    }
    
    public final void setOnKeyframeObserved(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    public final int getVideoWidth() {
        return 0;
    }
    
    public final int getVideoHeight() {
        return 0;
    }
    
    public final boolean getHasRenderedThisSession() {
        return false;
    }
    
    /**
     * The visible picture size described by a decoder output format.
     *
     * KEY_WIDTH/KEY_HEIGHT carry the buffer geometry, which vendors are free to pad out to their
     * macroblock alignment - Intel's AVC component reports 736 for a 720-line stream. Taking that
     * verbatim propagates a video size the stream does not have: the projection view scales to an
     * aspect ratio that is off by the padding, and a later restart reconfigures MediaCodec for the
     * padded height. The crop rectangle is the authoritative visible region, so prefer it and fall
     * back to the buffer geometry only where a decoder omits it.
     */
    private final kotlin.Pair<java.lang.Integer, java.lang.Integer> displaySizeOf(android.media.MediaFormat format) {
        return null;
    }
    
    /**
     * [crop] if it is a plausible visible extent for a buffer of [buffer] pixels, else [buffer].
     *
     * Padding only ever rounds a dimension *up* to an alignment boundary, and no decoder aligns
     * more coarsely than [MAX_ALIGNMENT_PADDING], so a trustworthy crop sits just below the buffer
     * size. Anything further away is a decoder filling the crop keys with placeholders rather than
     * describing this stream - zeros are the dangerous case, since a 0..0 crop reads as a legal
     * 1-pixel extent and would otherwise be propagated as the video size and handed to
     * MediaCodec on the next restart.
     */
    private final int croppedOr(int crop, int buffer) {
        return 0;
    }
    
    /**
     * Handles dynamic video dimension changes during the session.
     */
    private final void handleOutputFormatChange(android.media.MediaFormat format) {
    }
    
    /**
     * Sets the rendering surface and restarts the decoder if necessary.
     */
    public final void setSurface(@org.jetbrains.annotations.Nullable()
    android.view.Surface surface) {
    }
    
    /**
     * True when [surface] is the surface this decoder currently renders to.
     *
     * Identity comparison is deliberate: every teardown path hands back the exact Surface object
     * it created, so `===` distinguishes a live owner from a torn-down view whose callback is
     * arriving late.
     */
    public final boolean isCurrentSurface(@org.jetbrains.annotations.NotNull()
    android.view.Surface surface) {
        return false;
    }
    
    /**
     * Whether a live surface is attached, so a granted video focus has somewhere to draw.
     */
    public final boolean hasValidSurface() {
        return false;
    }
    
    /**
     * Stops the decoder only if [surface] still owns it. Compare-and-stop is atomic under the
     * same monitor [setSurface] and [stop] already hold, so a stale teardown from a torn-down
     * view can never stop a decoder that a newer surface has since claimed. [mSurface] is left
     * as it is either way — [stop] never cleared it, and [decode] guards on validity.
     *
     * @return whether the decoder was actually stopped.
     */
    public final boolean stopIfCurrentSurface(@org.jetbrains.annotations.NotNull()
    android.view.Surface surface, @org.jetbrains.annotations.NotNull()
    java.lang.String reason) {
        return false;
    }
    
    /**
     * Stops the decoder, terminates the output thread, and releases hardware resources.
     */
    public final void stop(@org.jetbrains.annotations.NotNull()
    java.lang.String reason) {
    }
    
    private final void scheduleRestart(java.lang.String reason) {
    }
    
    /**
     * Main entry point for decoding a video/control packet.
     *
     * Reports nothing back to the caller. A frame this cannot place into the codec's input queue
     * is lost here, and once the picture is live the loss asks the phone for a keyframe - see
     * [notifyFrameDropped] for the shape of that ask and why it stays silent before the first
     * rendered frame.
     */
    public final void decode(@org.jetbrains.annotations.NotNull()
    byte[] buffer, int offset, int size, boolean forceSoftware, @org.jetbrains.annotations.NotNull()
    java.lang.String codecName) {
    }
    
    /**
     * Copies a frame onto the feed queue. Returns immediately in every case - the caller is the
     * transport's read thread and must get back to the socket.
     */
    private final void enqueueForFeed(byte[] frameData, int frameOffset, int size) {
    }
    
    /**
     * Takes a buffer from the pool, growing it if this frame does not fit, or allocates one.
     */
    private final com.andrerinas.openheadunit.decoder.VideoDecoder.PendingFrame borrowFrame(int size) {
        return null;
    }
    
    /**
     * Returns a buffer to the pool, unless keeping it would push the pool past [pooledByteBudget].
     *
     * Dropping it on the floor is safe and deliberate - the next frame that needs a buffer allocates
     * one. Above a constrained device the budget is effectively unlimited, so this is the previous
     * behaviour exactly.
     */
    private final void recycleFrame(com.andrerinas.openheadunit.decoder.VideoDecoder.PendingFrame frame) {
    }
    
    /**
     * Counts a shed frame and, with the picture live, asks the phone for the keyframe that
     * repairs what the loss costs.
     *
     * Every frame shed here is a reference some later frame predicts from, so the picture drifts
     * washed-out and blocky until a keyframe arrives - and the phone runs a fixed keyframe period
     * measured at ~69s, so waiting that out costs an average of ~35s of corruption on screen.
     *
     * The transport answers with the gain-only unsolicited focus nudge first, throttled so a
     * sustained backlog costs one request a second rather than one per frame, and starts a clock
     * that [com.andrerinas.openheadunit.aap.KeyframeCycleEscalationPolicy] uses to decide whether
     * that was enough. There is still no P-frame latch here and never will be: gating the feed on
     * keyframe detection is what once made recovering from a drop more expensive than the drop.
     *
     * Before the first rendered frame this stays silent - a warming codec sheds frames while
     * perfectly healthy, and that window belongs to
     * [com.andrerinas.openheadunit.aap.WarmRelaunchKeyframePolicy], which must not have a second
     * decider reaching for the same lever underneath it.
     */
    private final void notifyFrameDropped() {
    }
    
    /**
     * Drains the feed queue into the codec. Deliberately does not hold this object's monitor:
     * stop() does, and joins this thread while holding it. Follows the output thread's contract
     * instead - read [codec] once, and let stop() clear [running] and interrupt before releasing.
     */
    private final void feedThreadLoop() {
    }
    
    /**
     * Reports a frame the codec had no room for, at most once per [FEED_DROP_LOG_INTERVAL_MS].
     *
     * Called from the feed thread only, so the counters need no synchronisation.
     */
    private final void logFeedDrop(java.lang.String detail) {
    }
    
    /**
     * Empties the feed queue back into the pool. Anything still waiting is stale after a stop.
     */
    private final void clearFrameQueue() {
    }
    
    private final boolean shouldUseBundledHevc(com.andrerinas.openheadunit.decoder.VideoDecoder.CodecType type, boolean forceSoftware) {
        return false;
    }
    
    /**
     * True when an explicitly selected software HEVC decoder is available, i.e. H.265 is playable
     * here even though [isHevcSupported] - which is hardware-only - says no. Mirrors the
     * `explicitSoftwareHevc` half of the announcement, so the decoder and the codec we asked the
     * phone for agree about whether H.265 was ever on the table.
     */
    private final boolean bundledHevcSelected() {
        return false;
    }
    
    private final void startBundledHevc(int width, int height) {
    }
    
    private final void onSoftwareFramesRendered(int renderedFrames) {
    }
    
    private final com.andrerinas.openheadunit.decoder.VideoDecoder.CodecType detectCodecType(byte[] buffer, int offset, int size) {
        return null;
    }
    
    /**
     * Splits a combined packet into multiple NAL units and normalizes start codes.
     */
    private final void forEachNalUnit(byte[] buffer, int offset, int size, kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Integer, kotlin.Unit> callback) {
    }
    
    /**
     * Reads this session's sequence parameter set: picture size for the codec, and the buffering
     * fields for the log.
     *
     * One parser for both codecs, because there were two and one of them was wrong. The H.264
     * dimension parser this replaces walked `pic_order_cnt_type == 1` as though it were type 0 - it
     * read the POC LSB field that only type 0 has - and every field after that, including the width
     * and height, came out of the wrong bits. It also had no RBSP unescaping, so a `0x03` anywhere in
     * the scaling matrix of a High-profile SPS shifted the same fields. [ParameterSetInspector]
     * handles both, is covered by vectors, and discards the whole result rather than returning half
     * of one.
     *
     * The logged fields are the ones that decide how many frames a decoder holds before it emits one,
     * and we have never recorded what Android Auto actually sends. Moonlight rewrites the H.264 SPS on
     * every Android 8.0+ device it runs on because unmodified encoder output makes some hardware
     * decoders allocate 16+ reference buffers and adds frames of latency; whether that lever exists
     * here is a question about `num_ref_frames` and `bitstream_restriction`, so print them rather
     * than assume either way. Read-only - nothing modifies the bitstream.
     */
    private final void applyParameterSet(byte[] nalData, int headerLen, com.andrerinas.openheadunit.decoder.VideoDecoder.CodecType type) {
    }
    
    /**
     * Takes the picture size from the stream rather than from what was negotiated.
     *
     * H.265 had no parser at all, so `mWidth` stayed zero and every H.265 session configured its
     * codec from `HeadUnitScreenConfig`'s negotiated size - which is what the phone was *asked* for,
     * not necessarily what it sent. That is what the "Fallback to negotiated dimensions" line reports,
     * and on an H.265 session it was reporting every time.
     *
     * Bounded rather than trusted, in the same spirit as the crop-rectangle check: a parse that comes
     * back with something outside any resolution a head unit projects is more likely a desync than a
     * discovery, and the negotiated size is the better guess in that case. Nothing here is final
     * either way - [handleOutputFormatChange] corrects the size again from the component's own output
     * format once frames start, which is the authority when they disagree.
     */
    private final void applyStreamDimensions(int width, int height, com.andrerinas.openheadunit.decoder.VideoDecoder.CodecType type) {
    }
    
    /**
     * Extracts SPS/PPS/VPS data for the decoder configuration (CSD).
     */
    private final void scanAndApplyConfig(byte[] buffer, int offset, int size, com.andrerinas.openheadunit.decoder.VideoDecoder.CodecType type) {
    }
    
    /**
     * Builds the mandatory part of the decoder format: parameter sets, input size and the per-vendor
     * stability patches. Everything here has to be set for the session to work at all, so none of it
     * takes part in the configure ladder - only [DecoderConfigLadder]'s optional keys do.
     */
    private final android.media.MediaFormat buildFormat(java.lang.String mimeType, int width, int height, java.lang.String bestCodec) {
        return null;
    }
    
    /**
     * Reports whether the chosen decoder can actually carry the picture it is about to be handed.
     *
     * Nothing acts on this. Codec selection stays where it was - the SoC allowlist in
     * [isHevcReliable] decides whether Auto mode offers H.265 at all - because overriding a codec the
     * user chose explicitly, or one already negotiated with the phone, is a bigger change than the
     * evidence supports. What was missing is the evidence: the artifact reports in #219 are mostly
     * from units where H.265 was selected by hand, and no log has ever said whether the component
     * that got it claims to manage that resolution and rate, or only to accept it.
     *
     * A WARN here on a unit that reports melting is the thing that would settle it.
     */
    private final void logDecoderCapability(java.lang.String codecName, java.lang.String mimeType, int width, int height) {
    }
    
    /**
     * Configures and starts the native MediaCodec.
     */
    private final void start(java.lang.String mimeType, boolean forceSoftware, int width, int height) {
    }
    
    /**
     * Says once, per distinct answer, what the config scanner made of an access unit.
     *
     * Which units get `BUFFER_FLAG_CODEC_CONFIG` is decided per unit now rather than per chipset, so
     * a device that never used to receive a mid-stream config buffer may now receive one. That is a
     * real change in what reaches the component and it was previously invisible: three lines a
     * session make it a fact in the capture instead of an argument about the code.
     */
    private final void reportContentOnce(com.andrerinas.openheadunit.aap.CodecConfigScanner.Content content) {
    }
    
    /**
     * Reads the parameter sets of an access unit that carries them and reports a genuine change.
     *
     * Diagnostic only - see [ParameterSetTracker] for why nothing here writes to the stored CSD or
     * the configured size. Runs only on units the config scanner says carry parameter sets, which is
     * keyframes and config messages, so the per-NAL copying [forEachNalUnit] does is paid a few times
     * a minute rather than sixty times a second.
     */
    private final void trackParameterSets(byte[] data, int offset, int size) {
    }
    
    /**
     * The size the new SPS describes, against the one the codec is configured for. Read-only: the
     * configured size is corrected by the component's own output format, and second-guessing it from
     * here is the behaviour change this measurement exists to justify or rule out.
     */
    private final java.lang.String describeSizeChange(byte[] nalData, int headerLen, boolean hevc) {
        return null;
    }
    
    /**
     * Queues one whole frame into the codec, or nothing at all.
     *
     * A frame is never split across input buffers: each queued buffer is parsed as a complete
     * access unit (this API range has no partial-frame flag), so a piece fed on its own reaches
     * the codec as a frame of its own and corrupts the picture as surely as the loss it was
     * trying to avoid - that is what the old truncate-and-feed path did.
     */
    private final com.andrerinas.openheadunit.decoder.VideoDecoder.FeedResult feedInputBuffer(java.nio.ByteBuffer buffer, long arrivalNanos) {
        return null;
    }
    
    /**
     * Periodic decode/render throughput summary.
     *
     * `rendered` counts buffers actually handed to the surface and `fed` counts frames accepted
     * into the codec's input queue, so the two together locate a slow picture: `fed` high with
     * `rendered` low is a slow codec, both high is a display consumer that cannot keep up with
     * one, and `dropped` rising is input-queue backpressure.
     *
     * `skipped` counts decoded frames discarded to reach a newer one, so it separates the two
     * shapes of a low `rendered`: with `skipped` high the frames arrived in a burst and the older
     * ones were deliberately passed over, with it near zero they never arrived at all.
     *
     * Called from the output thread on every loop iteration. That loop turns over at least every
     * 10ms (dequeueOutputBuffer's timeout) whether or not a frame came out, so the tick still
     * fires while nothing is rendering - which is the case most worth reporting.
     */
    private final void logThroughput() {
    }
    
    /**
     * Says once, in the reporter's own log, that the codec is what is losing the frames.
     *
     * Both numbers this reads have been printed on every throughput line for a long time and
     * nothing has ever interpreted them, which left the interpretation to whoever read the log by
     * hand - and that step is where two investigations went wrong. #219 was read as a reassembly
     * fault for five months on a device whose captures show shedding only in windows that also
     * spent up to 2019ms of 5000 waiting for an input buffer.
     *
     * The capability line from configure time is quoted alongside, because "the codec cannot keep
     * up" and "the codec said it could" only mean something together.
     */
    private final void reportBackpressure(long elapsedMs, long inputWaitMs, long dropped) {
    }
    
    /**
     * Dedicated thread to pull decoded frames and render them to the surface.
     */
    private final void outputThreadLoop() {
    }
    
    /**
     * Resolves the best available hardware or software decoder for the given mime type.
     */
    private final java.lang.String findBestCodec(java.lang.String mimeType, boolean preferHardware) {
        return null;
    }
    
    private final boolean isHardwareAccelerated(android.media.MediaCodecInfo info) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/VideoDecoder$CodecType;", "", "mimeType", "", "displayName", "settingsValue", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getMimeType", "getSettingsValue", "H264", "H265", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum CodecType {
        /*public static final*/ H264 /* = new H264(null, null, null) */,
        /*public static final*/ H265 /* = new H265(null, null, null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String mimeType = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String displayName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String settingsValue = null;
        
        CodecType(java.lang.String mimeType, java.lang.String displayName, java.lang.String settingsValue) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMimeType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDisplayName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSettingsValue() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.decoder.VideoDecoder.CodecType> getEntries() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001b\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019J\u0006\u0010\u001e\u001a\u00020\u0019J\u0006\u0010\u001f\u001a\u00020\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001a\u00a8\u0006 "}, d2 = {"Lcom/andrerinas/openheadunit/decoder/VideoDecoder$Companion;", "", "()V", "CONSTRAINED_POOL_BUDGET_BYTES", "", "FEED_DROP_LOG_INTERVAL_MS", "", "FEED_POLL_MS", "MAX_ALIGNMENT_PADDING", "MAX_CATCHUP_SKIPS", "MAX_PLAUSIBLE_HEIGHT", "MAX_PLAUSIBLE_WIDTH", "MAX_RESTARTS_WITHOUT_FRAME", "MAX_SYNC_STALL_RESTARTS", "MIN_PLAUSIBLE_DIMENSION", "MIN_POOLED_FRAME_BYTES", "MIN_POOLED_FRAME_BYTES_CONSTRAINED", "SYNC_STALL_COOLDOWN_MS", "SYNC_STALL_RESET_MS", "SYNC_STALL_SUPPRESSED_LOG_INTERVAL_MS", "SYNC_STALL_THRESHOLD_MS", "THROUGHPUT_LOG_INTERVAL_MS", "TIMEOUT_US", "WARM_RECONFIGURE_FIRST_FRAME_GRACE_MS", "cachedHwHevcSupported", "", "Ljava/lang/Boolean;", "isBundledHevcDecoderAvailable", "isHevcDecoderAvailable", "includeSoftware", "isHevcReliable", "isHevcSupported", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Checks if H.265 (HEVC) hardware decoding is supported and reliable on the current device.
         * Used for AUTO codec selection.
         */
        public final boolean isHevcReliable() {
            return false;
        }
        
        public final boolean isHevcSupported() {
            return false;
        }
        
        /**
         * Checks if H.265 (HEVC) decoding is present.
         *
         * Hardware-only is still the default because software HEVC has no real-time
         * performance guarantee. includeSoftware is used only for explicit user
         * overrides before falling back to bundled/native decoders.
         */
        public final boolean isHevcDecoderAvailable(boolean includeSoftware) {
            return false;
        }
        
        public final boolean isBundledHevcDecoderAvailable() {
            return false;
        }
    }
    
    /**
     * Outcome of [feedInputBuffer] for one frame.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/VideoDecoder$FeedResult;", "", "(Ljava/lang/String;I)V", "FED", "NO_INPUT_BUFFER", "DROPPED_TOO_LARGE", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static enum FeedResult {
        /*public static final*/ FED /* = new FED() */,
        /*public static final*/ NO_INPUT_BUFFER /* = new NO_INPUT_BUFFER() */,
        /*public static final*/ DROPPED_TOO_LARGE /* = new DROPPED_TOO_LARGE() */;
        
        FeedResult() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.decoder.VideoDecoder.FeedResult> getEntries() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/VideoDecoder$PendingFrame;", "", "data", "", "size", "", "arrivalNanos", "", "([BIJ)V", "getArrivalNanos", "()J", "setArrivalNanos", "(J)V", "getData", "()[B", "setData", "([B)V", "getSize", "()I", "setSize", "(I)V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class PendingFrame {
        @org.jetbrains.annotations.NotNull()
        private byte[] data;
        private int size;
        private long arrivalNanos;
        
        public PendingFrame(@org.jetbrains.annotations.NotNull()
        byte[] data, int size, long arrivalNanos) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final byte[] getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.NotNull()
        byte[] p0) {
        }
        
        public final int getSize() {
            return 0;
        }
        
        public final void setSize(int p0) {
        }
        
        public final long getArrivalNanos() {
            return 0L;
        }
        
        public final void setArrivalNanos(long p0) {
        }
    }
}