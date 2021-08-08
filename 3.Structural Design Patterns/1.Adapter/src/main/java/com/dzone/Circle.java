package com.dzone;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/4/2021 12:29 AM
*/

import com.tools.ConsoleColors;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println(ConsoleColors.ANSI_PURPLE + "Drawing Circle");
    }

    @Override
    public void resize() {
        System.out.println(ConsoleColors.ANSI_PURPLE + "Resizing Circle");
    }

    @Override
    public String description() {
        return ConsoleColors.ANSI_PURPLE + "Circle Object";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
