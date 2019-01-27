package com.samsung.myitschool.myapplication;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.MotionEvent;

public class Ball {
    private final float corX = 100;
    private float corY = 500;
    private float vY = 0;
    private float velocity = 0;
    private float vel = 0;

    void move(){
        corY += velocity;
        if(corY - 70 < 0 || corY + 70 > 1422 || (corY > vY - 20 && corY < vY + 20)){
            velocity = 0;
        }
        if(velocity + vel < 50){
            vel += 0.001;
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void setVec(MotionEvent event){
        float y = event.getY();
        vY = y;
        if(corY > y){
            velocity = -10 - vel;
        }
        if(corY == y){
            velocity = 0;
        }
        if(corY < y){
            velocity = 10 + vel;
        }
    }

    void onDraw(Canvas canvas){
        Log.d("cor", corX + " " + corY);
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(10);
        canvas.drawRect(corX - 40, corY - 25, corX + 40, corY + 25, paint);
    }
}
