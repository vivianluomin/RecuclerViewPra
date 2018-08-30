package com.example.asus1.learnrecyclerview;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;

public class RecyclerViewDeno extends RecyclerView {

    private static final String TAG = "RecyclerViewDeno";

    public RecyclerViewDeno(Context context) {
        super(context);
    }

    public RecyclerViewDeno(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public RecyclerViewDeno(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        Log.d(TAG, "onLayout: ");
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        super.onMeasure(widthSpec, heightSpec);
        Log.d(TAG, "onMeasure: ");
    }

    @Override
    public void onDraw(Canvas c) {
        super.onDraw(c);

        Log.d(TAG, "onDraw: ");
    }
}
