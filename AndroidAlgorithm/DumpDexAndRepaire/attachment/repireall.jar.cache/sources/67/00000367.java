package org.jf.dexlib2.c.b;

/* compiled from: BuilderInstruction35mi.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/b/aa.class */
public final class aa extends org.jf.dexlib2.c.c implements org.jf.dexlib2.e.b.a.aa {
    private static org.jf.dexlib2.d ve = org.jf.dexlib2.d.Format35mi;
    private int qy;
    private int vm;
    private int vn;
    private int vo;
    private int vp;
    private int vq;
    private int vr;

    public aa(org.jf.dexlib2.e eVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(eVar);
        this.qy = org.jf.dexlib2.h.f.bx(i);
        this.vm = i > 0 ? org.jf.dexlib2.h.f.bp(i2) : 0;
        this.vn = i > 1 ? org.jf.dexlib2.h.f.bp(i3) : 0;
        this.vo = i > 2 ? org.jf.dexlib2.h.f.bp(i4) : 0;
        this.vp = i > 3 ? org.jf.dexlib2.h.f.bp(i5) : 0;
        this.vq = i > 4 ? org.jf.dexlib2.h.f.bp(i6) : 0;
        this.vr = i7;
    }

    @Override // org.jf.dexlib2.e.b.s
    public final int im() {
        return this.qy;
    }

    @Override // org.jf.dexlib2.e.b.c
    public final int jS() {
        return this.vm;
    }

    @Override // org.jf.dexlib2.e.b.c
    public final int jT() {
        return this.vn;
    }

    @Override // org.jf.dexlib2.e.b.c
    public final int jU() {
        return this.vo;
    }

    @Override // org.jf.dexlib2.e.b.c
    public final int jV() {
        return this.vp;
    }

    @Override // org.jf.dexlib2.e.b.c
    public final int jW() {
        return this.vq;
    }

    @Override // org.jf.dexlib2.e.b.e
    public final int jX() {
        return this.vr;
    }

    @Override // org.jf.dexlib2.c.c
    public final org.jf.dexlib2.d jf() {
        return ve;
    }
}