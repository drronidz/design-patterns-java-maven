package com.course.animal;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/23/2021 6:40 PM
*/

import com.tools.ConsoleColors;

public class Duck implements Animal {
    @Override
    public void speak() {
        System.out.println(ConsoleColors.ANSI_CYAN + "Duck says : Pack-Pack ...");
    }
}
