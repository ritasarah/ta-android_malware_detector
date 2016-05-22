package android.support.v4.view;

import android.view.View;

class ViewCompatMarshmallow {
    ViewCompatMarshmallow() {
    }

    public static int getScrollIndicators(View view) {
        return view.getScrollIndicators();
    }

    public static void setScrollIndicators(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void setScrollIndicators(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
