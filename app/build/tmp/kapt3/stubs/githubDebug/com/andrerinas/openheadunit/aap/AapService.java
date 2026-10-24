package com.andrerinas.openheadunit.aap;

/**
 * Top-level foreground service that manages the Android Auto connection lifecycle.
 *
 * Responsibilities:
 * - Manages the [CommManager] connection state machine (USB and WiFi)
 * - Drives [AapProjectionActivity] via intents and connection state flow
 * - Runs a [WirelessServer] for the "server" WiFi mode and coordinates [NetworkDiscovery] scans
 * - Keeps a foreground notification updated to reflect the current connection state
 * - Manages car mode, night mode, media session, and GPS location service
 *
 * Connection types:
 * - **USB**: [UsbReceiver] detects attach → [checkAlreadyConnectedUsb] → [connectUsbWithRetry]
 * - **WiFi (client)**: [NetworkDiscovery] finds a Headunit Server → [CommManager.connect]
 * - **WiFi (server)**: [WirelessServer] accepts incoming sockets from AA Wireless / Self Mode
 * - **Self Mode**: starts [WirelessServer] and launches the AA Wireless Setup Activity on-device
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00dc\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 \u00df\u00012\u00020\u00012\u00020\u0002:\u0004\u00df\u0001\u00e0\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010c\u001a\u00020dH\u0002J\b\u0010e\u001a\u00020dH\u0002J\u001a\u0010f\u001a\u00020d2\u0006\u0010g\u001a\u00020\u001a2\b\u0010h\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010i\u001a\u00020\u0014H\u0002J\b\u0010j\u001a\u00020dH\u0002J\u0010\u0010k\u001a\u00020d2\u0006\u0010l\u001a\u00020mH\u0014J\u0012\u0010n\u001a\u00020d2\b\b\u0002\u0010o\u001a\u00020\u0014H\u0002J\u0010\u0010p\u001a\u00020d2\u0006\u0010q\u001a\u00020rH\u0002J \u0010s\u001a\u00020d2\u0006\u0010t\u001a\u00020u2\b\b\u0002\u0010v\u001a\u00020\u0005H\u0082@\u00a2\u0006\u0002\u0010wJ\u0012\u0010x\u001a\u0004\u0018\u00010y2\u0006\u0010z\u001a\u00020\u0005H\u0002J\n\u0010{\u001a\u0004\u0018\u00010yH\u0002J\b\u0010|\u001a\u00020}H\u0002J\u0013\u0010~\u001a\u0004\u0018\u00010\u000e2\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0002J!\u0010\u0081\u0001\u001a\u00020\u00142\u0006\u0010q\u001a\u00020r2\u0007\u0010\u0082\u0001\u001a\u00020\u001eH\u0086@\u00a2\u0006\u0003\u0010\u0083\u0001J\u0013\u0010\u0084\u0001\u001a\u00020d2\b\b\u0002\u0010o\u001a\u00020\u0014H\u0002J\t\u0010\u0085\u0001\u001a\u00020dH\u0002J\t\u0010\u0086\u0001\u001a\u00020\u0014H\u0002J\u0007\u0010\u0087\u0001\u001a\u00020\u0014J\t\u0010\u0088\u0001\u001a\u00020dH\u0002J\t\u0010\u0089\u0001\u001a\u00020dH\u0002J\u0012\u0010\u008a\u0001\u001a\u00020d2\u0007\u0010\u008b\u0001\u001a\u00020rH\u0002J\t\u0010\u008c\u0001\u001a\u00020dH\u0002J\u0013\u0010\u008d\u0001\u001a\u00020d2\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0002J\t\u0010\u0090\u0001\u001a\u00020dH\u0002J\t\u0010\u0091\u0001\u001a\u00020\u0014H\u0002J\u0013\u0010\u0091\u0001\u001a\u00020\u00142\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0002J$\u0010\u0092\u0001\u001a\u00020d2\b\u0010\u0093\u0001\u001a\u00030\u0094\u00012\u000f\u0010\u0095\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u0001H\u0002J\t\u0010\u0098\u0001\u001a\u00020\bH\u0002J\t\u0010\u0099\u0001\u001a\u00020dH\u0002J\t\u0010\u009a\u0001\u001a\u00020dH\u0002J\u0011\u0010\u009b\u0001\u001a\u00020d2\u0006\u0010g\u001a\u00020\u001aH\u0002J\u0013\u0010\u009c\u0001\u001a\u00020d2\b\u0010\u009d\u0001\u001a\u00030\u009e\u0001H\u0002J\u0016\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u00a0\u00012\b\u0010\u00a1\u0001\u001a\u00030\u008f\u0001H\u0016J\t\u0010\u00a2\u0001\u001a\u00020dH\u0002J\t\u0010\u00a3\u0001\u001a\u00020dH\u0016J\t\u0010\u00a4\u0001\u001a\u00020dH\u0016J\u0013\u0010\u00a5\u0001\u001a\u00020d2\b\u0010\u00a6\u0001\u001a\u00030\u00a7\u0001H\u0002J\t\u0010\u00a8\u0001\u001a\u00020dH\u0002J\u0012\u0010\u00a9\u0001\u001a\u00020d2\u0007\u0010\u0093\u0001\u001a\u00020rH\u0002J-\u0010\u00aa\u0001\u001a\u00020d2\u0007\u0010\u00ab\u0001\u001a\u00020r2\u0007\u0010\u00ac\u0001\u001a\u00020r2\u0007\u0010\u00ad\u0001\u001a\u00020r2\u0007\u0010\u00ae\u0001\u001a\u00020rH\u0002J\u0012\u0010\u00af\u0001\u001a\u00020d2\u0007\u0010\u0093\u0001\u001a\u00020rH\u0002J\t\u0010\u00b0\u0001\u001a\u00020dH\u0002J\'\u0010\u00b1\u0001\u001a\u00020\u00052\n\u0010\u00a1\u0001\u001a\u0005\u0018\u00010\u008f\u00012\u0007\u0010\u00b2\u0001\u001a\u00020\u00052\u0007\u0010\u00b3\u0001\u001a\u00020\u0005H\u0016J\u0015\u0010\u00b4\u0001\u001a\u00020d2\n\u0010\u00b5\u0001\u001a\u0005\u0018\u00010\u008f\u0001H\u0016J\t\u0010\u00b6\u0001\u001a\u00020dH\u0016J\u0011\u0010\u00b7\u0001\u001a\u00020d2\u0006\u0010t\u001a\u00020uH\u0016J\u0011\u0010\u00b8\u0001\u001a\u00020d2\u0006\u0010t\u001a\u00020uH\u0016J#\u0010\u00b9\u0001\u001a\u00020d2\u0007\u0010\u00ba\u0001\u001a\u00020\u00142\u0007\u0010\u00bb\u0001\u001a\u00020\u00142\u0006\u0010t\u001a\u00020uH\u0016J\t\u0010\u00bc\u0001\u001a\u00020dH\u0002J\u0011\u0010\u00bd\u0001\u001a\u00020d2\u0006\u0010t\u001a\u00020uH\u0002J\u0007\u0010\u00be\u0001\u001a\u00020dJ\t\u0010\u00bf\u0001\u001a\u00020dH\u0002J\t\u0010\u00c0\u0001\u001a\u00020dH\u0002J\t\u0010\u00c1\u0001\u001a\u00020dH\u0002J\t\u0010\u00c2\u0001\u001a\u00020dH\u0002J\t\u0010\u00c3\u0001\u001a\u00020dH\u0002J\t\u0010\u00c4\u0001\u001a\u00020dH\u0002J\t\u0010\u00c5\u0001\u001a\u00020dH\u0002J\u0011\u0010\u00c6\u0001\u001a\u00020d2\u0006\u0010t\u001a\u00020uH\u0002J\u0013\u0010\u00c7\u0001\u001a\u00020\u00142\b\u0010\u009d\u0001\u001a\u00030\u009e\u0001H\u0002J3\u0010\u00c8\u0001\u001a\u0005\u0018\u0001H\u00c9\u0001\"\u0005\b\u0000\u0010\u00c9\u00012\u0017\b\u0004\u0010\u00ca\u0001\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0005\u0012\u0003H\u00c9\u00010\u00cb\u0001H\u0082\b\u00a2\u0006\u0003\u0010\u00cc\u0001J\u0011\u0010\u00cd\u0001\u001a\u00020d2\u0006\u0010g\u001a\u00020\u001aH\u0002J\t\u0010\u00ce\u0001\u001a\u00020dH\u0002J\u0013\u0010\u00cf\u0001\u001a\u00020d2\b\u0010\u00a6\u0001\u001a\u00030\u00a7\u0001H\u0002J\t\u0010\u00d0\u0001\u001a\u00020dH\u0002J\t\u0010\u00d1\u0001\u001a\u00020dH\u0002J\t\u0010\u00d2\u0001\u001a\u00020dH\u0002J\u0014\u0010\u00d3\u0001\u001a\u00020d2\t\b\u0002\u0010\u00d4\u0001\u001a\u00020\u0014H\u0002J\t\u0010\u00d5\u0001\u001a\u00020dH\u0002J\t\u0010\u00d6\u0001\u001a\u00020dH\u0002J\t\u0010\u00d7\u0001\u001a\u00020dH\u0002J\t\u0010\u00d8\u0001\u001a\u00020dH\u0002J\u0007\u0010\u00d9\u0001\u001a\u00020dJ\t\u0010\u00da\u0001\u001a\u00020dH\u0002J\u0011\u0010\u00db\u0001\u001a\u00020d2\u0006\u0010g\u001a\u00020\u001aH\u0002J\u0010\u0010\u00dc\u0001\u001a\u00020d2\u0007\u0010\u00dd\u0001\u001a\u00020\u0014J\t\u0010\u00de\u0001\u001a\u00020dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0018\u00010\u000bR\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010C\u001a\u00020D8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bG\u0010-\u001a\u0004\bE\u0010FR\u000e\u0010H\u001a\u00020IX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010J\u001a\u0004\u0018\u00010KX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010L\u001a\u0004\u0018\u00010MX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020OX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020QX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010U\u001a\u0004\u0018\u00010VX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010W\u001a\u0004\u0018\u00010XX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010Y\u001a\b\u0018\u00010ZR\u00020[X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010]\u001a\u0004\u0018\u000106X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010^\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010a\u001a\b\u0018\u00010bR\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00e1\u0001"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapService;", "Landroid/app/Service;", "Lcom/andrerinas/openheadunit/connection/UsbReceiver$Listener;", "()V", "accessoryHandshakeFailures", "", "activeHelperStrategy", "activeNativeTransport", "Lcom/andrerinas/openheadunit/aap/NativeTransport;", "activeWifiMode", "bootWakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "cachedAaAlbumArtBitmap", "Landroid/graphics/Bitmap;", "commManager", "Lcom/andrerinas/openheadunit/connection/CommManager;", "getCommManager", "()Lcom/andrerinas/openheadunit/connection/CommManager;", "discoveryDormantAfterWifiLoss", "", "hasEverConnected", "isDestroying", "isSwitchingToAccessory", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lastAaMediaMetadata", "Lcom/andrerinas/openheadunit/aap/protocol/proto/MediaPlayback$MediaMetaData;", "lastAaPlaybackIsPlaying", "Ljava/lang/Boolean;", "lastAaPlaybackPositionMs", "", "lastNetworkAvailableKickMs", "lastWakeHandledTimestamp", "lastWirelessRebuildAtMs", "localHotspotCredentialsProvider", "Lcom/andrerinas/openheadunit/connection/LocalHotspotCredentialsProvider;", "mediaButtonReceiver", "Landroid/content/BroadcastReceiver;", "mediaMetadataDecodeJob", "Lkotlinx/coroutines/Job;", "mediaNotification", "Lcom/andrerinas/openheadunit/main/BackgroundNotification;", "getMediaNotification", "()Lcom/andrerinas/openheadunit/main/BackgroundNotification;", "mediaNotification$delegate", "Lkotlin/Lazy;", "mediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "mediaSessionIsPlaying", "nativeAaHandshakeManager", "Lcom/andrerinas/openheadunit/connection/NativeAaHandshakeManager;", "nearbyManager", "Lcom/andrerinas/openheadunit/connection/NearbyManager;", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkDiscovery", "Lcom/andrerinas/openheadunit/connection/NetworkDiscovery;", "nightModeManager", "Lcom/andrerinas/openheadunit/utils/NightModeManager;", "nightModeUpdateReceiver", "permanentFocusRequest", "Landroid/media/AudioFocusRequest;", "rescanWithoutWaiting", "screenOffTimestamp", "sensorRefreshReceiver", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "getSettings", "()Lcom/andrerinas/openheadunit/utils/Settings;", "settings$delegate", "settingsPreferenceListener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "settingsPrefs", "Landroid/content/SharedPreferences;", "softApCredentialsProvider", "Lcom/andrerinas/openheadunit/connection/SoftApCredentialsProvider;", "uiModeManager", "Landroid/app/UiModeManager;", "usbReceiver", "Lcom/andrerinas/openheadunit/connection/UsbReceiver;", "userExitCooldownUntil", "userExitedAA", "wakeDetectReceiver", "wifiAutoStartReceiver", "Lcom/andrerinas/openheadunit/app/WifiAutoStartReceiver;", "wifiDirectManager", "Lcom/andrerinas/openheadunit/connection/WifiDirectManager;", "wifiLock", "Landroid/net/wifi/WifiManager$WifiLock;", "Landroid/net/wifi/WifiManager;", "wifiModeInitialized", "wifiReadyCallback", "wifiReadyTimeoutJob", "wirelessRebuildWindowStartedAtMs", "wirelessRebuildsInWindow", "wirelessServer", "Lcom/andrerinas/openheadunit/aap/AapService$WirelessServer;", "acquireBootWakeLock", "", "acquireWifiLock", "applyAaMediaMetadataToSession", "meta", "albumArt", "applyBootLoopGuard", "applyPlaceholderMediaMetadata", "attachBaseContext", "newBase", "Landroid/content/Context;", "checkAlreadyConnectedUsb", "force", "completeWifiWait", "reason", "", "connectUsbWithRetry", "device", "Landroid/hardware/usb/UsbDevice;", "maxRetries", "(Landroid/hardware/usb/UsbDevice;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createFakeNetwork", "Landroid/os/Parcelable;", "netId", "createFakeWifiInfo", "createNotification", "Landroid/app/Notification;", "decodeAlbumArt", "bytes", "", "ensureWirelessServerListening", "timeoutMs", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initWifiMode", "initWifiModeWithOptionalWait", "isAaVersion174OrHigher", "isWirelessServerListening", "launchAapProjectionActivity", "launchDirectly", "launchMainActivityIfNeeded", "source", "launchMainActivityOnBoot", "launchProjectionViaNotification", "launchIntent", "Landroid/content/Intent;", "launchViaFullScreenIntent", "launchViaOverlayTrampoline", "maybeTearDownBeforeLinkGoes", "trigger", "Lcom/andrerinas/openheadunit/aap/LinkLossTrigger;", "pendingResult", "Lkotlin/Function0;", "Landroid/content/BroadcastReceiver$PendingResult;", "nativeTransport", "notifyBootLoopPause", "observeConnectionState", "onAaMediaMetadataFromPhone", "onAaPlaybackStatusFromPhone", "status", "Lcom/andrerinas/openheadunit/aap/protocol/proto/MediaPlayback$MediaPlaybackStatus;", "onBind", "Landroid/os/IBinder;", "intent", "onConnected", "onCreate", "onDestroy", "onDisconnected", "state", "Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState$Disconnected;", "onHandshakeFailed", "onHibernateWake", "onNativeCredentials", "ssid", "psk", "ip", "bssid", "onPossibleWake", "onScreenOnAutoStart", "onStartCommand", "flags", "startId", "onTaskRemoved", "rootIntent", "onUsbAccessoryDetach", "onUsbAttach", "onUsbDetach", "onUsbPermission", "granted", "connect", "openAaSettings", "performSingleUsbConnect", "refreshHotspotCredentialsAfterJoinFailure", "refreshMediaSessionMetadataForPrefsChange", "registerNetworkMonitor", "registerReceivers", "releaseBootWakeLock", "releasePermanentAudioFocus", "releaseWifiLock", "requestPermanentAudioFocus", "requestUsbPermission", "resolveIsPlayingFromStatus", "safeMediaSessionCall", "T", "block", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "scheduleApplyAaMediaMetadata", "scheduleBootLoopStrikeClear", "scheduleReconnectIfNeeded", "setupCarMode", "setupMediaSession", "setupNightMode", "startDiscovery", "oneShot", "startSelfMode", "startWirelessServer", "stopWirelessServer", "syncLogBackendState", "triggerWifiDirectRefresh", "unregisterNetworkMonitor", "updateMediaNotification", "updateMediaSessionState", "isPlaying", "updateNotification", "Companion", "WirelessServer", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AapService extends android.app.Service implements com.andrerinas.openheadunit.connection.UsbReceiver.Listener {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope serviceScope = null;
    private android.app.UiModeManager uiModeManager;
    private com.andrerinas.openheadunit.connection.UsbReceiver usbReceiver;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.utils.NightModeManager nightModeManager;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.connection.WifiDirectManager wifiDirectManager;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.connection.SoftApCredentialsProvider softApCredentialsProvider;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.connection.LocalHotspotCredentialsProvider localHotspotCredentialsProvider;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.connection.NativeAaHandshakeManager nativeAaHandshakeManager;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.connection.NearbyManager nearbyManager;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.app.WifiAutoStartReceiver wifiAutoStartReceiver;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile com.andrerinas.openheadunit.aap.AapService.WirelessServer wirelessServer;
    private long lastWirelessRebuildAtMs = 0L;
    private int wirelessRebuildsInWindow = 0;
    private long wirelessRebuildWindowStartedAtMs = 0L;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.connection.NetworkDiscovery networkDiscovery;
    @org.jetbrains.annotations.Nullable()
    private android.support.v4.media.session.MediaSessionCompat mediaSession;
    
    /**
     * Last `NetworkCallback.onAvailable` we acted on, for the debounce in [registerNetworkMonitor].
     */
    private long lastNetworkAvailableKickMs = 0L;
    
    /**
     * Set when a network-available kick found a sweep already in flight and was folded into it.
     * The sweep it joined was started for the *previous* network, so the one after it should not
     * wait out the ordinary re-arm. Consumed once, in the discovery listener's `onScanFinished`.
     */
    @kotlin.jvm.Volatile()
    private volatile boolean rescanWithoutWaiting = false;
    
    /**
     * Set when a link-loss teardown closed the session because station WiFi was going away.
     *
     * The ordinary answer to a disconnect is to restart the discovery loop two seconds later, and
     * that is wrong here: the network it would scan is the one on its way down. What it finds is
     * whatever interface enumerates first — a modem bridge, typically — and it sweeps that subnet
     * every ten seconds until WiFi returns, which costs nothing but reads in a captured log
     * exactly like discovery probing the wrong network for real.
     *
     * Cleared when a network comes back, which is also what revives the loop: `onAvailable` calls
     * `startScan()` on the instance that is still there.
     */
    @kotlin.jvm.Volatile()
    private volatile boolean discoveryDormantAfterWifiLoss = false;
    @org.jetbrains.annotations.Nullable()
    private android.media.AudioFocusRequest permanentFocusRequest;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaMetaData lastAaMediaMetadata;
    private long lastAaPlaybackPositionMs = 0L;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean lastAaPlaybackIsPlaying;
    private boolean mediaSessionIsPlaying = false;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job mediaMetadataDecodeJob;
    
    /**
     * Decoded on a background thread in [scheduleApplyAaMediaMetadata]; reused for notification updates on position ticks.
     */
    @org.jetbrains.annotations.Nullable()
    private android.graphics.Bitmap cachedAaAlbumArtBitmap;
    @org.jetbrains.annotations.Nullable()
    private android.content.SharedPreferences settingsPrefs;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy settings$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mediaNotification$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener settingsPreferenceListener = null;
    
    /**
     * Set to `true` before calling [stopSelf] or entering [onDestroy] to suppress any
     * flow observers that would otherwise update the already-dismissed notification.
     */
    private boolean isDestroying = false;
    private boolean hasEverConnected = false;
    private int accessoryHandshakeFailures = 0;
    @org.jetbrains.annotations.Nullable()
    private android.net.ConnectivityManager.NetworkCallback networkCallback;
    @org.jetbrains.annotations.Nullable()
    private android.net.wifi.WifiManager.WifiLock wifiLock;
    @org.jetbrains.annotations.Nullable()
    private android.net.ConnectivityManager.NetworkCallback wifiReadyCallback;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job wifiReadyTimeoutJob;
    private boolean wifiModeInitialized = false;
    private int activeWifiMode = -1;
    private int activeHelperStrategy = -1;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.aap.NativeTransport activeNativeTransport;
    
    /**
     * Partial wake lock acquired when the service starts from boot/screen-on.
     * Keeps the CPU active while the head unit runs without ACC, making the
     * service harder for MediaTek's background power saving to kill.
     */
    @org.jetbrains.annotations.Nullable()
    private android.os.PowerManager.WakeLock bootWakeLock;
    
    /**
     * Runtime-registered receiver for MEDIA_BUTTON intents.
     * Unlike manifest-registered receivers, runtime receivers are NOT affected by
     * Android 8+ implicit broadcast restrictions — this is a critical difference
     * that makes steering wheel controls work on China headunits.
     */
    @org.jetbrains.annotations.NotNull()
    private final android.content.BroadcastReceiver mediaButtonReceiver = null;
    
    /**
     * Guards against duplicate [UsbAccessoryMode.connectAndSwitch] calls AND duplicate
     * [connectUsbWithRetry] calls for devices already in accessory mode.
     *
     * Set to `true` synchronously on the main thread before launching any background
     * USB connect/switch coroutine. Checked in [checkAlreadyConnectedUsb] to prevent
     * multiple concurrent connection attempts on the same device.
     * Cleared in the coroutine's finally block, or on disconnect.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.atomic.AtomicBoolean isSwitchingToAccessory = null;
    
    /**
     * Set when the phone sends VIDEO_FOCUS_NATIVE (user tapped "Exit" in AA).
     * Suppresses [scheduleReconnectIfNeeded] so we don't try to reconnect to a
     * stale dongle that hasn't re-enumerated yet.
     * Cleared on USB detach (dongle reset complete) or on fresh USB attach.
     */
    @kotlin.jvm.Volatile()
    private volatile boolean userExitedAA = false;
    @kotlin.jvm.Volatile()
    private volatile long userExitCooldownUntil = 0L;
    @org.jetbrains.annotations.NotNull()
    private final android.content.BroadcastReceiver nightModeUpdateReceiver = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.BroadcastReceiver sensorRefreshReceiver = null;
    
    /**
     * Timestamp (elapsedRealtime) when the screen last turned off.
     * Used to measure how long the device was asleep and distinguish a normal
     * screen timeout from a hibernate wake (car ACC off → on).
     */
    private long screenOffTimestamp = 0L;
    
    /**
     * Debounce: last time [onHibernateWake] actually ran.
     * Prevents double-triggering when both BootCompleteReceiver and this dynamic
     * receiver fire for the same wake event.
     */
    private long lastWakeHandledTimestamp = 0L;
    
    /**
     * Runtime-registered receiver for system wake/boot/power/screen events.
     *
     * On Chinese head units with Quick Boot (hibernate/resume), standard broadcasts
     * like BOOT_COMPLETED and USB_DEVICE_ATTACHED often don't fire after waking.
     * This receiver serves two purposes:
     *
     * 1. **Diagnostic logging:** Logs every received system event with the
     *   "WakeDetect:" prefix so users can export logs and we can see which
     *   broadcasts their specific head unit sends (or doesn't send) on wake.
     *
     * 2. **Universal wake detection:** Uses ACTION_SCREEN_ON (which fires on ALL
     *   devices after hibernate) combined with screen-off duration tracking to
     *   detect hibernate wakes and trigger auto-start — regardless of which OEM
     *   boot/ACC intents the device sends.
     *
     * ACTION_SCREEN_ON can only be received by dynamically registered receivers,
     * not manifest-declared ones — that's why the manifest-based BootCompleteReceiver
     * can't catch it and we need this service-based approach.
     */
    @org.jetbrains.annotations.NotNull()
    private final android.content.BroadcastReceiver wakeDetectReceiver = null;
    
    /**
     * Bind attempts before the wireless server gives up and reports the port unusable.
     */
    private static final int BIND_ATTEMPTS = 3;
    
    /**
     * Gap between them. A port released by a peer that just left frees within this.
     */
    private static final long BIND_RETRY_DELAY_MS = 700L;
    
    /**
     * If set to `true`, the service will call [System.exit] at the very end of [onDestroy].
     * This is used by `killOnDisconnect` to ensure all cleanup (like Car Mode) completes
     * before the process dies.
     */
    private static boolean killProcessOnDestroy = false;
    
    /**
     * `true` while a Self Mode session is active.
     */
    private static boolean selfMode = false;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> wifiDirectName = null;
    
    /**
     * Emits `true` while a WiFi NSD scan is in progress.
     * Observed by `HomeFragment` via a lifecycle-aware flow collector.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> scanningState = null;
    private static final int BOOT_START_NOTIFICATION_ID = 42;
    private static final int BOOT_LOOP_NOTIFICATION_ID = 43;
    private static final int PROJECTION_LAUNCH_NOTIFICATION_ID = 43;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_START_SELF_MODE = "com.andrerinas.openheadunit.ACTION_START_SELF_MODE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_START_WIRELESS = "com.andrerinas.openheadunit.ACTION_START_WIRELESS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_BT_AUTO_START = "com.andrerinas.openheadunit.ACTION_BT_AUTO_START";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_START_WIRELESS_SCAN = "com.andrerinas.openheadunit.ACTION_START_WIRELESS_SCAN";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_STOP_WIRELESS = "com.andrerinas.openheadunit.ACTION_STOP_WIRELESS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_NATIVE_AA_POKE = "com.andrerinas.openheadunit.ACTION_NATIVE_AA_POKE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_NEARBY_CONNECT = "com.andrerinas.openheadunit.ACTION_NEARBY_CONNECT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_CHECK_USB = "com.andrerinas.openheadunit.ACTION_CHECK_USB";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_STOP_SERVICE = "com.andrerinas.openheadunit.aap.action.STOP_SERVICE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_DISCONNECT = "com.andrerinas.openheadunit.ACTION_DISCONNECT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_REQUEST_NIGHT_MODE_UPDATE = "com.andrerinas.openheadunit.aap.action.REQUEST_NIGHT_MODE_UPDATE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_NIGHT_MODE_CHANGED = "com.andrerinas.openheadunit.ACTION_NIGHT_MODE_CHANGED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_ORIENTATION_CHANGED = "com.andrerinas.openheadunit.ACTION_ORIENTATION_CHANGED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_REFRESH_SENSORS = "com.andrerinas.openheadunit.aap.action.REFRESH_SENSORS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_RESTART_AUDIO = "com.andrerinas.openheadunit.aap.action.RESTART_AUDIO";
    
    /**
     * Sent after the caller has already invoked [CommManager.connect(socket)].
     * The [observeConnectionState] flow observer handles the result — [onStartCommand]
     * does nothing for this action.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_CONNECT_SOCKET = "com.andrerinas.openheadunit.ACTION_CONNECT_SOCKET";
    
    /**
     * Max handshake failures on a stale accessory device before forcing AOA re-enumeration.
     */
    private static final int MAX_STALE_ACCESSORY_RETRIES = 1;
    
    /**
     * Delay before retrying USB connection after an unexpected disconnect.
     */
    private static final long USB_RECONNECT_DELAY_MS = 3000L;
    
    /**
     * `NetworkCallback.onAvailable` fires per network and again on re-validation, so a
     * single join can produce several. One discovery kick per join is what is wanted.
     */
    private static final long NETWORK_AVAILABLE_DEBOUNCE_MS = 1000L;
    
    /**
     * How long a link-loss teardown may take. The interface is already on its way down and the
     * broadcast is holding the system up, so this is a budget rather than a target: the
     * ByeBye and the socket close together take well under 200 ms when the link still works,
     * and when it does not there is nothing to wait for.
     */
    private static final long LINK_LOSS_TEARDOWN_BUDGET_MS = 1500L;
    
    /**
     * Cooldown period after user-initiated exit. During this window, the WirelessServer
     * rejects incoming connections to prevent the phone from instantly reconnecting.
     */
    private static final long USER_EXIT_COOLDOWN_MS = 5000L;
    
    /**
     * Delay before AapService tries to handle a normal-mode USB attach as a fallback
     * when UsbAttachedActivity doesn't fire (common on Chinese MediaTek headunits).
     */
    private static final long USB_ATTACH_FALLBACK_DELAY_MS = 2000L;
    
    /**
     * Screen-off duration (ms) above which SCREEN_ON is treated as a hibernate wake.
     * 60 seconds filters out normal screen timeouts while catching any hibernate/quick boot.
     */
    private static final long HIBERNATE_WAKE_THRESHOLD_MS = 60000L;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_MAC = "extra_mac";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ENDPOINT_ID = "extra_endpoint_id";
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.AapService.Companion Companion = null;
    
    public AapService() {
        super();
    }
    
    private final <T extends java.lang.Object>T safeMediaSessionCall(kotlin.jvm.functions.Function1<? super android.support.v4.media.session.MediaSessionCompat, ? extends T> block) {
        return null;
    }
    
    private final com.andrerinas.openheadunit.utils.Settings getSettings() {
        return null;
    }
    
    private final com.andrerinas.openheadunit.main.BackgroundNotification getMediaNotification() {
        return null;
    }
    
    private final void syncLogBackendState() {
    }
    
    private final com.andrerinas.openheadunit.connection.CommManager getCommManager() {
        return null;
    }
    
    public final void updateMediaSessionState(boolean isPlaying) {
    }
    
    private final void applyPlaceholderMediaMetadata() {
    }
    
    private final void refreshMediaSessionMetadataForPrefsChange() {
    }
    
    private final void onAaMediaMetadataFromPhone(com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaMetaData meta) {
    }
    
    private final void onAaPlaybackStatusFromPhone(com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaPlaybackStatus status) {
    }
    
    private final boolean resolveIsPlayingFromStatus(com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaPlaybackStatus status) {
        return false;
    }
    
    private final void updateMediaNotification(com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaMetaData meta) {
    }
    
    private final void scheduleApplyAaMediaMetadata(com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaMetaData meta) {
    }
    
    private final android.graphics.Bitmap decodeAlbumArt(byte[] bytes) {
        return null;
    }
    
    private final void applyAaMediaMetadataToSession(com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaMetaData meta, android.graphics.Bitmap albumArt) {
    }
    
    /**
     * Called when we've confidently detected a hibernate wake (screen was off for
     * a long time, or an OEM boot/ACC intent was received by the dynamic receiver).
     */
    private final void onHibernateWake(java.lang.String trigger) {
    }
    
    /**
     * Called on events that MIGHT indicate a wake (e.g. POWER_CONNECTED) but aren't
     * conclusive alone. Only checks USB — does not launch the UI.
     */
    private final void onPossibleWake(java.lang.String trigger) {
    }
    
    /**
     * Called on every SCREEN_ON when "Start on screen on" is enabled.
     * Designed for head units that never truly power off — screen on = car turned on.
     *
     * If the connection is still active (e.g. brief screen toggle), returns to the
     * projection activity. Otherwise launches the main UI and checks USB.
     */
    private final void onScreenOnAutoStart() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    /**
     * Enables Android Automotive UI mode so the system uses car-optimised layouts.
     */
    private final void setupCarMode() {
    }
    
    /**
     * Initialises [NightModeManager] and forwards night-mode changes to Android Auto via AAP.
     */
    private final void setupNightMode() {
    }
    
    /**
     * Single observer for all [CommManager.ConnectionState] transitions.
     *
     * Uses [hasEverConnected] to skip the initial [ConnectionState.Disconnected] emission
     * from StateFlow replay, avoiding a spurious disconnect on startup.
     */
    private final void observeConnectionState() {
    }
    
    /**
     * Performs the permanent audio focus request used for AA audio sink.
     *
     * This logic was previously executed in onCreate(); it has been moved here so
     * the caller can decide when to acquire focus (for example, immediately before
     * starting the AA handshake) to avoid stealing audio during autostart.
     *
     * The permanent AUDIOFOCUS_GAIN is only appropriate for Static Audio Focus mode,
     * where the phone must believe focus is always held. In the default (dynamic) mode
     * focus is instead acquired on demand via the AA protocol
     * (AapControl.audioFocusRequest -> AapAudio.requestFocusChange), so grabbing a
     * permanent gain here would needlessly evict other media (e.g. the car radio) the
     * moment the phone connects, before AA plays anything.
     *
     * Whether to take it at all is PlaybackFocusPolicy's call, the same as for the dynamic path:
     * on a head unit that is also the phone's Bluetooth A2DP sink, evicting the sink makes it
     * AVRCP-pause that same phone, so the session starts with the projected audio stopped.
     */
    private final void requestPermanentAudioFocus() {
    }
    
    /**
     * Releases any permanent audio focus previously requested by [requestPermanentAudioFocus].
     *
     * This is invoked on disconnect to return audio focus to the phone or other media
     * apps so that playback can resume normally. Supports both the modern
     * AudioFocusRequest API (API >= O) and the legacy abandonAudioFocus path.
     */
    private final void releasePermanentAudioFocus() {
    }
    
    /**
     * Called by [CommManager.ConnectionState.Connected] observer:
     * 1. Refreshes the foreground notification.
     * 2. Activates a [MediaSessionCompat] so media keys are routed to Android Auto.
     * 3. Starts the SSL handshake ([CommManager.startHandshake]) **in parallel** with
     *   launching [AapProjectionActivity], hiding multi-second handshake latency behind
     *   activity-inflation time.
     *
     * The inbound message loop ([CommManager.startReading]) is intentionally NOT started
     * here. It is deferred until [AapProjectionActivity] confirms its render surface is
     * ready (via [CommManager.ConnectionState.HandshakeComplete] observer), guaranteeing
     * that [VideoDecoder.setSurface] is always called before the first video frame arrives.
     */
    private final void onConnected() {
    }
    
    private final void launchAapProjectionActivity() {
    }
    
    private final void launchProjectionViaNotification(android.content.Intent launchIntent) {
    }
    
    private final void setupMediaSession() {
    }
    
    /**
     * Called by [CommManager.ConnectionState.Disconnected] observer:
     * 1. Refreshing the notification (unless we are already tearing down)
     * 2. Releasing the [MediaSessionCompat]
     * 3. Stopping audio/video decoders on the IO thread
     * 4. Scheduling a reconnect attempt if applicable (see [scheduleReconnectIfNeeded])
     */
    private final void onDisconnected(com.andrerinas.openheadunit.connection.CommManager.ConnectionState.Disconnected state) {
    }
    
    /**
     * Schedules a reconnect attempt 2 seconds after an unexpected disconnect:
     * - **Server mode** ([wirelessServer] != null): always restarts the discovery loop.
     * - **Auto WiFi mode** (mode == 1): triggers a one-shot scan on unclean disconnect only.
     *
     * [CommManager.ConnectionState.Disconnected.isClean] is `true` only when the phone
     * explicitly sends a `ByeByeRequest`. All other causes (USB detach, read error, explicit
     * disconnect) produce `isClean = false`.
     */
    private final void scheduleReconnectIfNeeded(com.andrerinas.openheadunit.connection.CommManager.ConnectionState.Disconnected state) {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context newBase) {
    }
    
    private final void registerReceivers() {
    }
    
    private final void registerNetworkMonitor() {
    }
    
    private final void unregisterNetworkMonitor() {
    }
    
    /**
     * Decides whether to call [initWifiMode] immediately or wait for WiFi connectivity.
     *
     * When "Wait for WiFi before WiFi Direct" is enabled AND WiFi connection mode is 2
     * (Wireless Helper), registers a [ConnectivityManager.NetworkCallback] filtered to
     * TRANSPORT_WIFI. [initWifiMode] fires as soon as WiFi connects, or after the
     * configured timeout — whichever comes first.
     *
     * When the setting is disabled, or the mode is not 2, [initWifiMode] runs immediately.
     */
    private final void initWifiModeWithOptionalWait() {
    }
    
    private final void completeWifiWait(java.lang.String reason) {
    }
    
    /**
     * Starts [WirelessServer] if the user has configured server WiFi mode.
     */
    private final void initWifiMode(boolean force) {
    }
    
    private final void acquireWifiLock() {
    }
    
    private final void releaseWifiLock() {
    }
    
    /**
     * Acquires a partial wake lock to resist MediaTek/Reglink background power
     * saving that force-stops third-party apps when ACC is off.
     * The wake lock has a 10-minute timeout as a safety net.
     */
    private final void acquireBootWakeLock() {
    }
    
    private final void releaseBootWakeLock() {
    }
    
    @java.lang.Override()
    public void onTaskRemoved(@org.jetbrains.annotations.Nullable()
    android.content.Intent rootIntent) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override()
    public void onUsbAttach(@org.jetbrains.annotations.NotNull()
    android.hardware.usb.UsbDevice device) {
    }
    
    @java.lang.Override()
    public void onUsbDetach(@org.jetbrains.annotations.NotNull()
    android.hardware.usb.UsbDevice device) {
    }
    
    @java.lang.Override()
    public void onUsbAccessoryDetach() {
    }
    
    @java.lang.Override()
    public void onUsbPermission(boolean granted, boolean connect, @org.jetbrains.annotations.NotNull()
    android.hardware.usb.UsbDevice device) {
    }
    
    private final void requestUsbPermission(android.hardware.usb.UsbDevice device) {
    }
    
    /**
     * Called when a handshake fails. If an accessory-mode device is still present,
     * it's likely a stale wireless AA dongle. Force re-enumeration by sending AOA
     * descriptors — this resets the dongle's USB state so the next connection
     * starts with clean buffers.
     */
    private final void onHandshakeFailed() {
    }
    
    /**
     * Scans currently connected USB devices and connects to any that are already in
     * Android Open Accessory (AOA) mode, or attempts to switch a known device into AOA mode.
     *
     * @param force When `true`, bypasses the [autoConnectLastSession] guard. Use `true` when
     *             called in response to an actual USB attach event or from [UsbAttachedActivity],
     *             because the user has explicitly plugged in a device. Use `false` (default)
     *             for the startup scan in [onCreate].
     */
    private final void checkAlreadyConnectedUsb(boolean force) {
    }
    
    private final void performSingleUsbConnect(android.hardware.usb.UsbDevice device) {
    }
    
    /**
     * Attempts a USB connection up to [maxRetries] times with a 1.5 s delay between attempts.
     *
     * USB accessories occasionally fail on the first attach (the device hasn't fully
     * enumerated yet), so retrying is necessary for reliability.
     */
    private final java.lang.Object connectUsbWithRetry(android.hardware.usb.UsbDevice device, int maxRetries, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Starts the [WirelessServer] (TCP on port 5288) and kicks off the initial NSD scan.
     * No-op if the server is already running.
     */
    private final void startWirelessServer() {
    }
    
    /**
     * Credentials for the network the phone should join, from whichever transport produced them.
     * Both mode-3 transports funnel through here so the poke rules stay in one place.
     */
    private final void onNativeCredentials(java.lang.String ssid, java.lang.String psk, java.lang.String ip, java.lang.String bssid) {
    }
    
    /**
     * Whether the AAP TCP port the phone will be sent to is bound and accepting.
     *
     * The Bluetooth handshake checks this before handing over credentials, mirroring the ordering
     * the reference head unit software uses: access point up, address resolved, port bound, and
     * only then talk to the phone.
     */
    public final boolean isWirelessServerListening() {
        return false;
    }
    
    /**
     * Tries to get the AAP port bound, and reports whether it is.
     *
     * Called by the Bluetooth handshake when it finds the port unbound with credentials already in
     * hand. Until this existed the handshake could only give up, so a server that died once stayed
     * dead for the life of the mode: the phone was woken, told to join a network, and left dialling
     * a port nothing was listening on, every few seconds, indefinitely.
     *
     * The start is marshalled onto Main because every other caller of [startWirelessServer] runs
     * there. Without that, this one arrives from `Dispatchers.IO` and can pass the "nothing is
     * assigned" check at the same moment [initWifiMode] does, and both bind. `SO_REUSEADDR` does not
     * help there - it covers a port in TIME_WAIT, not one with a live listener on it - so the loser
     * throws and spends its retry budget losing to its own sibling.
     *
     * @param reason what asked, for the log.
     * @param timeoutMs how long to wait for the bind after asking.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object ensureWirelessServerListening(@org.jetbrains.annotations.NotNull()
    java.lang.String reason, long timeoutMs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    /**
     * The transport mode 3 is configured to use. Read fresh: the user can change it in settings.
     */
    private final com.andrerinas.openheadunit.aap.NativeTransport nativeTransport() {
        return null;
    }
    
    /**
     * Closes an active session while the link it rides still works.
     *
     * Android Auto's head unit server is wedged permanently by a peer that vanishes without
     * closing, and only a restart on the phone clears it. A session that closes properly does not
     * do that. The system warns us before some link losses and not others; this takes the ones it
     * does warn about.
     *
     * [pendingResult] keeps the broadcast alive while the teardown runs, because it does socket
     * work and the caller is a receiver on the main thread. It is always finished.
     */
    private final void maybeTearDownBeforeLinkGoes(com.andrerinas.openheadunit.aap.LinkLossTrigger trigger, kotlin.jvm.functions.Function0<? extends android.content.BroadcastReceiver.PendingResult> pendingResult) {
    }
    
    public final void refreshHotspotCredentialsAfterJoinFailure() {
    }
    
    public final void triggerWifiDirectRefresh() {
    }
    
    /**
     * Starts an NSD (mDNS) scan for Android Auto Wireless services on the local network.
     *
     * @param oneShot if `true`, does not reschedule after the scan finishes —
     *               used for the "auto WiFi" reconnect case.
     */
    private final void startDiscovery(boolean oneShot) {
    }
    
    private final void stopWirelessServer() {
    }
    
    private final android.app.Notification createNotification() {
        return null;
    }
    
    private final void updateNotification() {
    }
    
    /**
     * Launches MainActivity when reopenOnReconnection is enabled and no activity is currently
     * visible. Uses the same overlay trampoline technique as boot auto-start to bypass OEM
     * background activity start restrictions.
     */
    private final void launchMainActivityIfNeeded(java.lang.String source) {
    }
    
    private final void launchMainActivityOnBoot() {
    }
    
    private final void launchDirectly() {
    }
    
    private final boolean launchViaOverlayTrampoline() {
        return false;
    }
    
    private final boolean launchViaOverlayTrampoline(android.content.Intent launchIntent) {
        return false;
    }
    
    private final void launchViaFullScreenIntent() {
    }
    
    /**
     * Whether to skip wireless bring-up because starting it appears to be crashing the device, and
     * posts the notice explaining that if so.
     *
     * See [BootLoopPolicy]. The decision is taken from the strike count the receiver has already
     * written, so it needs nothing from the start intent and can run here in onCreate.
     */
    private final boolean applyBootLoopGuard() {
        return false;
    }
    
    /**
     * Clears the strikes once this run has lasted long enough to count as healthy.
     *
     * Deliberately time-based rather than hung off a successful connection: on the head unit this
     * guard was written for, one cycle reached a complete projection session with audio playing and
     * the system died anyway, so a connection-based signal would reset the count every pass.
     */
    private final void scheduleBootLoopStrikeClear() {
    }
    
    /**
     * Tells the user wireless was left off and what to do about it. Names the WiFi Direct join when
     * that is the configuration, because on the units this happens to, switching the Native AA
     * transport to the head unit's own hotspot avoids the P2P path altogether.
     */
    private final void notifyBootLoopPause() {
    }
    
    /**
     * "Self Mode" connects the device to itself over the loopback interface.
     *
     * Starts [WirelessServer] on port 5288, then launches the Google AA Wireless Setup
     * Activity pointing at `127.0.0.1:5288`. This causes the AA Wireless app to treat
     * the device as both the head unit and the phone, enabling a loopback session.
     *
     * [createFakeNetwork] and [createFakeWifiInfo] produce the Parcelable extras the
     * AA Wireless activity requires; they are constructed reflectively because the
     * relevant Android classes have no public constructors.
     */
    private final boolean isAaVersion174OrHigher() {
        return false;
    }
    
    private final void openAaSettings() {
    }
    
    private final void startSelfMode() {
    }
    
    /**
     * Reflectively constructs an `android.net.Network` from a raw network ID integer.
     */
    private final android.os.Parcelable createFakeNetwork(int netId) {
        return null;
    }
    
    /**
     * Reflectively constructs a `WifiInfo` with a fake SSID for the Self Mode intent.
     */
    private final android.os.Parcelable createFakeWifiInfo() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0017X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0017X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0015X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0017X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0015X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0017X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0017X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0017X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020%0+\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\'\"\u0004\b0\u0010)R\u0019\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040+\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010-\u00a8\u00063"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapService$Companion;", "", "()V", "ACTION_BT_AUTO_START", "", "ACTION_CHECK_USB", "ACTION_CONNECT_SOCKET", "ACTION_DISCONNECT", "ACTION_NATIVE_AA_POKE", "ACTION_NEARBY_CONNECT", "ACTION_NIGHT_MODE_CHANGED", "ACTION_ORIENTATION_CHANGED", "ACTION_REFRESH_SENSORS", "ACTION_REQUEST_NIGHT_MODE_UPDATE", "ACTION_RESTART_AUDIO", "ACTION_START_SELF_MODE", "ACTION_START_WIRELESS", "ACTION_START_WIRELESS_SCAN", "ACTION_STOP_SERVICE", "ACTION_STOP_WIRELESS", "BIND_ATTEMPTS", "", "BIND_RETRY_DELAY_MS", "", "BOOT_LOOP_NOTIFICATION_ID", "BOOT_START_NOTIFICATION_ID", "EXTRA_ENDPOINT_ID", "EXTRA_MAC", "HIBERNATE_WAKE_THRESHOLD_MS", "LINK_LOSS_TEARDOWN_BUDGET_MS", "MAX_STALE_ACCESSORY_RETRIES", "NETWORK_AVAILABLE_DEBOUNCE_MS", "PROJECTION_LAUNCH_NOTIFICATION_ID", "USB_ATTACH_FALLBACK_DELAY_MS", "USB_RECONNECT_DELAY_MS", "USER_EXIT_COOLDOWN_MS", "killProcessOnDestroy", "", "getKillProcessOnDestroy", "()Z", "setKillProcessOnDestroy", "(Z)V", "scanningState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getScanningState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "selfMode", "getSelfMode", "setSelfMode", "wifiDirectName", "getWifiDirectName", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * If set to `true`, the service will call [System.exit] at the very end of [onDestroy].
         * This is used by `killOnDisconnect` to ensure all cleanup (like Car Mode) completes
         * before the process dies.
         */
        public final boolean getKillProcessOnDestroy() {
            return false;
        }
        
        /**
         * If set to `true`, the service will call [System.exit] at the very end of [onDestroy].
         * This is used by `killOnDisconnect` to ensure all cleanup (like Car Mode) completes
         * before the process dies.
         */
        public final void setKillProcessOnDestroy(boolean p0) {
        }
        
        /**
         * `true` while a Self Mode session is active.
         */
        public final boolean getSelfMode() {
            return false;
        }
        
        /**
         * `true` while a Self Mode session is active.
         */
        public final void setSelfMode(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getWifiDirectName() {
            return null;
        }
        
        /**
         * Emits `true` while a WiFi NSD scan is in progress.
         * Observed by `HomeFragment` via a lifecycle-aware flow collector.
         */
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getScanningState() {
            return null;
        }
    }
    
    /**
     * Coroutine-based server that listens for incoming TCP connections on port 5288.
     *
     * Registers the service over mDNS (NSD) as `_aawireless._tcp` so Android Auto
     * Wireless clients can discover it automatically. Each accepted socket is handed
     * off to [CommManager.connect] on the service coroutine scope. Only one connection
     * is allowed at a time; subsequent sockets are closed immediately.
     *
     * Uses [isActive] for cooperative cancellation. [stopServer] cancels the job and
     * closes the server socket to unblock the blocking [ServerSocket.accept] call.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0011J\b\u0010\u0015\u001a\u00020\u0011H\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapService$WirelessServer;", "", "(Lcom/andrerinas/openheadunit/aap/AapService;)V", "isAlive", "", "()Z", "<set-?>", "isListening", "job", "Lkotlinx/coroutines/Job;", "nsdManager", "Landroid/net/nsd/NsdManager;", "registrationListener", "Landroid/net/nsd/NsdManager$RegistrationListener;", "serverSocket", "Ljava/net/ServerSocket;", "logLocalNetworkInterfaces", "", "registerNsd", "start", "stopServer", "unregisterNsd", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    final class WirelessServer {
        @org.jetbrains.annotations.Nullable()
        private java.net.ServerSocket serverSocket;
        @org.jetbrains.annotations.Nullable()
        private android.net.nsd.NsdManager nsdManager;
        @org.jetbrains.annotations.Nullable()
        private android.net.nsd.NsdManager.RegistrationListener registrationListener;
        @org.jetbrains.annotations.Nullable()
        private kotlinx.coroutines.Job job;
        
        /**
         * Whether the TCP port the phone is told to dial is actually bound right now.
         *
         * start() only launches a coroutine; the bind happens inside it and can fail (the port
         * still held by a previous session is the usual way). Handing the phone credentials for a
         * port nothing is listening on produces the worst possible log: a clean handshake, a
         * successful WiFi join, and then silence.
         */
        @kotlin.jvm.Volatile()
        private volatile boolean isListening = false;
        
        public WirelessServer() {
            super();
        }
        
        /**
         * Whether the TCP port the phone is told to dial is actually bound right now.
         *
         * start() only launches a coroutine; the bind happens inside it and can fail (the port
         * still held by a previous session is the usual way). Handing the phone credentials for a
         * port nothing is listening on produces the worst possible log: a clean handshake, a
         * successful WiFi join, and then silence.
         */
        public final boolean isListening() {
            return false;
        }
        
        public final boolean isAlive() {
            return false;
        }
        
        public final void start(boolean registerNsd) {
        }
        
        /**
         * Logs all non-loopback IPv4 addresses; useful for debugging connectivity issues.
         */
        private final void logLocalNetworkInterfaces() {
        }
        
        private final void registerNsd() {
        }
        
        private final void unregisterNsd() {
        }
        
        public final void stopServer() {
        }
    }
}