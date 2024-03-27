package com.example.snakegame;

import android.graphics.Canvas;
import android.graphics.Paint;

abstract class GameObject {
    protected int mSize; // Size of the object

    public GameObject(int size) {
        this.mSize = size;
    }

    // Abstract method for drawing the object
    abstract void draw(Canvas canvas, Paint paint);
}
