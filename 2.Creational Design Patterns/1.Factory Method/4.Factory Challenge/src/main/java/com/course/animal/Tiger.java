package com.course.animal;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/23/2021 6:41 PM
*/

import com.tools.ConsoleColors;

public class Tiger implements Animal {
    @Override
    public void speak() {
        System.out.println(ConsoleColors.ANSI_GREEN + "Tiger says : Halum-Halum ...");
    }
}
