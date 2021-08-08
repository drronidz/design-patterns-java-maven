package com.course.color;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/24/2021 1:17 AM
*/

import com.tools.ConsoleColors;

public class Red implements Color{
    @Override
    public void fill() {
        System.out.println(ConsoleColors.ANSI_RED + "Inside Red::fill() method.");
    }
}
