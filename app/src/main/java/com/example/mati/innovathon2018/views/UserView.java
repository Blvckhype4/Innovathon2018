package com.example.mati.innovathon2018.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class UserView extends View {
    private Rect mBounds;
    private Context mContext;

    public UserView(Context context, AttributeSet attrs, Rect mBounds) {
        super(context, attrs);
        mContext = context;
        this.mBounds = mBounds;

    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }
}
