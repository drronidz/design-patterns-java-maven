package com.dzone;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/4/2021 12:28 AM
*/

import com.tools.ConsoleColors;


public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println(ConsoleColors.ANSI_GREEN + "Drawing Rectangle");
    }

    @Override
    public void resize() {
        System.out.println(ConsoleColors.ANSI_GREEN + "Resizing Rectangle");
    }

    @Override
    public String description() {
        return ConsoleColors.ANSI_GREEN + "Rectangle Object";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
