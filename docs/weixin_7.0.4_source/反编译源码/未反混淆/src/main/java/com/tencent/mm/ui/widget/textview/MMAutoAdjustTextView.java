package com.tencent.mm.ui.widget.textview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.google.android.gms.common.util.CrashUtils.ErrorDialogData;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cg.a.a;
import com.tencent.mm.ui.aj;

public class MMAutoAdjustTextView extends TextView {
    private float eOg;
    private float scale;
    private Paint vQ;

    public MMAutoAdjustTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AppMethodBeat.i(113111);
        b(context.obtainStyledAttributes(attributeSet, a.MMAutoAdjustTextView));
        init();
        AppMethodBeat.o(113111);
    }

    public MMAutoAdjustTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AppMethodBeat.i(113112);
        b(context.obtainStyledAttributes(attributeSet, a.MMAutoAdjustTextView));
        init();
        AppMethodBeat.o(113112);
    }

    private void init() {
        AppMethodBeat.i(113113);
        this.eOg = getTextSize();
        this.scale = aj.dm(getContext());
        this.vQ = new Paint();
        this.vQ.set(getPaint());
        AppMethodBeat.o(113113);
    }

    private static void b(TypedArray typedArray) {
        AppMethodBeat.i(113114);
        if (typedArray != null) {
            typedArray.recycle();
        }
        AppMethodBeat.o(113114);
    }

    private void Qx(int i) {
        AppMethodBeat.i(113115);
        if (i <= 0) {
            AppMethodBeat.o(113115);
            return;
        }
        while (true) {
            measure(0, MeasureSpec.makeMeasureSpec(getMeasuredHeight(), ErrorDialogData.SUPPRESSED));
            if (((float) getMeasuredWidth()) > ((float) i)) {
                this.eOg -= aj.getDensity(getContext());
                setTextSize(0, this.eOg * this.scale);
            } else {
                AppMethodBeat.o(113115);
                return;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        AppMethodBeat.i(113116);
        super.onTextChanged(charSequence, i, i2, i3);
        charSequence.toString();
        Qx(getWidth());
        AppMethodBeat.o(113116);
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        AppMethodBeat.i(113117);
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            getText().toString();
            Qx(i);
        }
        AppMethodBeat.o(113117);
    }
}
