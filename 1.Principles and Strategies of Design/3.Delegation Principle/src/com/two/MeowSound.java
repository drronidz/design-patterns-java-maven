package com.two;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/1/2021 11:50 PM
*/

import static com.tools.ConsoleColors.ANSI_GREEN;

// Delegate class
public class MeowSound implements ISoundBehaviour {
    @Override
    public void makeSound() {
        System.out.println(ANSI_GREEN + "Meow Meow ...");
    }
}
