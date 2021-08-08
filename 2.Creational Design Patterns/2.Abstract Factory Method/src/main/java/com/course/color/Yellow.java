package com.course.color;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/24/2021 1:15 AM
*/

import com.tools.ConsoleColors;

public class Yellow implements Color {
    @Override
    public void fill() {
        System.out.println(ConsoleColors.ANSI_YELLOW + "Inside Yellow::fill() method.");
    }
}
