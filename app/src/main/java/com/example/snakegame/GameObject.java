package com.example.snakegame;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

abstract class GameObject {
    protected Point location; // Location of the game object
    protected int mSize; // Size of the object

    protected Point velocity = new Point(0, 0); // Initialize with no movement
    protected Point acceleration = new Point(0, 0); // Initialize with no acceleration
    protected float speedMultiplier = 1.0f; // Start with normal speed

    public GameObject(Point location, int size) {
        this.location = location;
        this.mSize = size;
    }

    public GameObject(Point location, int size, Point velocity) {
        this.location = location;
        mSize = size;
        this.velocity = velocity;
    }

    public void updatePosition() {
        location.x += velocity.x;
        location.y += velocity.y;

        // Apply velocity to location, adjusted by the speed multiplier
        location.x += (int)(velocity.x * speedMultiplier);
        location.y += (int)(velocity.y * speedMultiplier);
    }
    public void setAcceleration(int ax, int ay) {
        acceleration.set(ax, ay);
    }

    public void setSpeedMultiplier(float multiplier) {
        speedMultiplier = multiplier;
    }


    // Abstract method for drawing the object
    abstract void draw(Canvas canvas, Paint paint);
}
