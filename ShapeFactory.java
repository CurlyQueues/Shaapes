package com.example.jordan.shaapes;

import android.content.Context;

/**
 * Created by Jordan on 3/27/16.
 */
public class ShapeFactory {

        public Shape getShape(Context context, String ShapeType)
        {
            if ( ShapeType.equalsIgnoreCase("Circle") )
                return new Circle();
            else if ( ShapeType.equalsIgnoreCase("Rectangle") )
                return new Rectangle();


            return null;
        }
    }



}
