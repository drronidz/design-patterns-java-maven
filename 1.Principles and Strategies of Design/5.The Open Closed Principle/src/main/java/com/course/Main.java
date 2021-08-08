package com.course;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/21/2021 1:28 AM
*/

import com.tools.ConsoleColors;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5,7);

        AreaCalculator areaCalculator = new AreaCalculator();

        System.out.println(ConsoleColors.ANSI_WHITE + areaCalculator.calculateShapeArea(circle));
        System.out.println(ConsoleColors.ANSI_YELLOW + areaCalculator.calculateShapeArea(rectangle));

    }
}
