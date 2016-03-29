package com.example.jordan.shaapes;

import android.graphics.Canvas;

/**
 * Created by Jordan on 3/27/16.
 */
class Rectangle implements Shape{



    @Override
    public float getShapeAlpha() {
        return 0;
    }

    public void onDraw(Canvas canvas){

    }

    public void removeShape(){

    }


    public ShapeType getShapeType(){

        return ShapeType.Rectangle;
    }




    public void setShapeAlpha(float alpha){


    }
}

