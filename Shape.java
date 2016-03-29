package com.example.jordan.shaapes;

import android.graphics.Canvas;

/**
 * Created by Jordan on 3/27/16.
 */


public interface Shape {

    void setShapeAlpha(float alpha);

    float getShapeAlpha();

    void removeShape();

    abstract ShapeType getShapeType();

    abstract void onDraw(Canvas canvas);

};


