package com.samsung.myitschool.myapplication;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;

public class Star {
    private float corX = (float) (Math.random()*2560);
    private float corY = (float) (Math.random()*1422);
    private float velocity = 10;

    public void move(){
        if(corX < 0){
            corX = 2560;
            corY = (float) (Math.random()*1422);
        }
        corX -= velocity;
        if(velocity < 40){
            velocity += 0.001;
        }
    }

    void onDraw(Canvas canvas){
        Log.d("cor", corX + " " + corY);
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(10);
        canvas.drawCircle(corX, corY,3, paint);
    }
}
