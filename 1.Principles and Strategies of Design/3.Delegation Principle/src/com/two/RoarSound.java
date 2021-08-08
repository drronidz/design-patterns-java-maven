package com.two;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/1/2021 11:51 PM
*/

import static com.tools.ConsoleColors.ANSI_PURPLE;

// Delegate class
public class RoarSound implements ISoundBehaviour {
    @Override
    public void makeSound() {
        System.out.println(ANSI_PURPLE + "Roar Roar ...");
    }
}
