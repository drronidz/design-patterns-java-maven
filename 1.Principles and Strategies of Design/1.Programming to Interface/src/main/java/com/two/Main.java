package com.two;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/18/2021 12:41 AM
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(" -------------------------- Programming to Interface (EXAMPLE Three) --------------------------");
        // using an Interface as a reference type
        Shape circle =  new Circle();
        Shape rectangle = new Rectangle();

        print(circle);
        print(rectangle);

        System.out.println(" --------------------------------------------------------------------------------------------");

    }

    // using an Interface as a argument method
    private static void  print(Shape shape) {
        shape.draw();
    }

    // using an Interface as a return type
    private Collection getShapes() {
        List<Shape> shapes = new ArrayList<>();
        // adding elements to the list of shapes ( ArrayList here)
        return shapes;
    }
}


