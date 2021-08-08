package com.course.color;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/24/2021 1:16 AM
*/

import com.tools.ConsoleColors;

public class Purple implements Color {
    @Override
    public void fill() {
        System.out.println(ConsoleColors.ANSI_PURPLE + "Inside Purple::fill() method.");
    }
}
