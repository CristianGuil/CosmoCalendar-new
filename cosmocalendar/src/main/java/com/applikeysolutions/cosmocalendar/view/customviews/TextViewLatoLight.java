package com.applikeysolutions.cosmocalendar.view.customviews;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class TextViewLatoLight extends AppCompatTextView {

    public TextViewLatoLight(Context context) {
        super(context);
        init();
    }

    public TextViewLatoLight(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextViewLatoLight(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-Light.ttf"));
    }

}
