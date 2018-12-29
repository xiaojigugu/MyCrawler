package com.example.mycrawler.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class FirstToThree extends View {

    private Paint backgroundPaint;
    private Paint textPaint;
    private RectF oval;
    private Path path;
    private int which = 0;
    private int radius=50;

    public FirstToThree(Context context) {
        super(context, null);
        initPaint();
    }

    public FirstToThree(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs, 0);
        initPaint();
    }

    public FirstToThree(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr, 0);
        initPaint();
    }

    private void initPaint() {
        oval = new RectF(-radius, -radius, radius, radius);
        path = new Path();
        path.moveTo(0, radius);
        path.lineTo(radius, 0);
        textPaint = new Paint();
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(radius/2);
        textPaint.setStrokeWidth(2);
        textPaint.setColor(Color.WHITE);
        backgroundPaint = new Paint();
        backgroundPaint.setAntiAlias(true);
        backgroundPaint.setStyle(Paint.Style.FILL);
        if (which == 0) {
            backgroundPaint.setColor(Color.YELLOW);
        } else if (which == 1) {
            backgroundPaint.setColor(Color.RED);
        } else {
            backgroundPaint.setColor(Color.BLUE);
        }
    }

    public void setWhich(int which,int radius) {
        Log.e("FirstToThree","setWhich "+which);
        this.which = which;
        this.radius=radius;
        initPaint();
        invalidate();
        forceLayout();
        requestLayout();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawColor(Color.WHITE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.e("FirstToThree","onDraw "+which);
        canvas.drawArc(oval, 0, 90, true, backgroundPaint);
        if (which == 0) {
            canvas.drawTextOnPath("1", path, (float) (Math.sqrt(2*radius*radius)/2)-radius/6, 0, textPaint);
        } else if (which == 1) {
            canvas.drawTextOnPath("2", path, (float) (Math.sqrt(2*radius*radius)/2)-radius/6, 0, textPaint);
        } else {
            canvas.drawTextOnPath("3", path, (float) (Math.sqrt(2*radius*radius)/2)-radius/6, 0, textPaint);
        }

    }
}
