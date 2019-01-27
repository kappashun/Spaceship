package com.samsung.myitschool.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class GameField extends View {

    Ball ball = new Ball();
    Meteor meteor1 = new Meteor();
    Meteor meteor2 = new Meteor();
    Meteor meteor3 = new Meteor();
    Star star1 = new Star();
    Star star2 = new Star();
    Star star3 = new Star();
    Star star4 = new Star();
    Star star5 = new Star();
    Star star6 = new Star();
    Star star7 = new Star();
    Star star8 = new Star();
    Star star9 = new Star();

    public GameField(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public GameField(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.BLACK);
        star1.onDraw(canvas);
        star2.onDraw(canvas);
        star3.onDraw(canvas);
        star4.onDraw(canvas);
        star5.onDraw(canvas);
        star6.onDraw(canvas);
        star7.onDraw(canvas);
        star8.onDraw(canvas);
        star9.onDraw(canvas);
        meteor1.onDraw(canvas);
        meteor2.onDraw(canvas);
        meteor3.onDraw(canvas);
        ball.onDraw(canvas);
        invalidate();
    }

    public void update(){
        ball.move();
        meteor1.move();
        meteor2.move();
        meteor3.move();
        star1.move();
        star2.move();
        star3.move();
        star4.move();
        star5.move();
        star6.move();
        star7.move();
        star8.move();
        star9.move();

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        ball.setVec(event);
        Log.d("vec", event.getX() + " " + event.getY());
        return super.onTouchEvent(event);
    }
}
