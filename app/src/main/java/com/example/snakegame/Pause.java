package com.example.snakegame;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.MotionEvent;
public class Pause {
    private Bitmap mBitmapPause;
    private int mSize;
    private Point location = new Point();

    Pause(Context context, int s){
        mSize = s;
        mBitmapPause = BitmapFactory.decodeResource(context.getResources(), R.drawable.pause);
        mBitmapPause = Bitmap.createScaledBitmap(mBitmapPause, s, s, false);
    }

    void draw(Canvas canvas, Paint paint){
        int x = 2120;
        int y = 120;
        canvas.drawBitmap(mBitmapPause,
                location.x * mSize, location.y * mSize, paint);
        //mCanvas.drawText("" + mScore, x:20, y:120, mPaint);

    }

}
