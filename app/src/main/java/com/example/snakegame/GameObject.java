package com.example.snakegame;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

abstract class GameObject {
    protected Point location; // Location of the game object
    protected int mSize; // Size of the object

    public GameObject(Point location, int size) {
        this.location = location;
        this.mSize = size;
    }

    // Abstract method for drawing the object
    abstract void draw(Canvas canvas, Paint paint);
}
