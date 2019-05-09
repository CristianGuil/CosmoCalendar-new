package com.applikeysolutions.cosmocalendar.view.customviews;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class TextViewLatoBold extends AppCompatTextView {

    public TextViewLatoBold(Context context) {
        super(context);
        init();
    }

    public TextViewLatoBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextViewLatoBold(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-Black.ttf"));
    }

}
