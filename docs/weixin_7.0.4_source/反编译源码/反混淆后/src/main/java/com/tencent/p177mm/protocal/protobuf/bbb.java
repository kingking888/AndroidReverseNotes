package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.bbb */
public final class bbb extends C1331a {
    public String ThumbUrl;
    public String Title;
    public int wFQ;
    public int wFR;
    public int wkB;
    public String wkC;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(54952);
        C6092b c6092b;
        int bs;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.Title == null) {
                c6092b = new C6092b("Not all required fields were included: Title");
                AppMethodBeat.m2505o(54952);
                throw c6092b;
            } else if (this.ThumbUrl == null) {
                c6092b = new C6092b("Not all required fields were included: ThumbUrl");
                AppMethodBeat.m2505o(54952);
                throw c6092b;
            } else {
                c6093a.mo13480iz(1, this.wFQ);
                if (this.Title != null) {
                    c6093a.mo13475e(2, this.Title);
                }
                if (this.ThumbUrl != null) {
                    c6093a.mo13475e(3, this.ThumbUrl);
                }
                c6093a.mo13480iz(4, this.wkB);
                if (this.wkC != null) {
                    c6093a.mo13475e(5, this.wkC);
                }
                c6093a.mo13480iz(6, this.wFR);
                AppMethodBeat.m2505o(54952);
                return 0;
            }
        } else if (i == 1) {
            bs = C6091a.m9572bs(1, this.wFQ) + 0;
            if (this.Title != null) {
                bs += C6091a.m9575f(2, this.Title);
            }
            if (this.ThumbUrl != null) {
                bs += C6091a.m9575f(3, this.ThumbUrl);
            }
            bs += C6091a.m9572bs(4, this.wkB);
            if (this.wkC != null) {
                bs += C6091a.m9575f(5, this.wkC);
            }
            bs += C6091a.m9572bs(6, this.wFR);
            AppMethodBeat.m2505o(54952);
            return bs;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (bs = C1331a.getNextFieldNumber(c6086a); bs > 0; bs = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, bs)) {
                    c6086a.ems();
                }
            }
            if (this.Title == null) {
                c6092b = new C6092b("Not all required fields were included: Title");
                AppMethodBeat.m2505o(54952);
                throw c6092b;
            } else if (this.ThumbUrl == null) {
                c6092b = new C6092b("Not all required fields were included: ThumbUrl");
                AppMethodBeat.m2505o(54952);
                throw c6092b;
            } else {
                AppMethodBeat.m2505o(54952);
                return 0;
            }
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            bbb bbb = (bbb) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    bbb.wFQ = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(54952);
                    return 0;
                case 2:
                    bbb.Title = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(54952);
                    return 0;
                case 3:
                    bbb.ThumbUrl = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(54952);
                    return 0;
                case 4:
                    bbb.wkB = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(54952);
                    return 0;
                case 5:
                    bbb.wkC = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(54952);
                    return 0;
                case 6:
                    bbb.wFR = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(54952);
                    return 0;
                default:
                    AppMethodBeat.m2505o(54952);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(54952);
            return -1;
        }
    }
}
