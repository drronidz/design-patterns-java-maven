package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/25/2021 4:36 PM
*/

import com.tools.ConsoleColors;

public class Client {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        // Set the data value
        singleton.setData(55);

        System.out.println(ConsoleColors.ANSI_CYAN + " First reference: " + singleton);
        System.out.println(ConsoleColors.ANSI_CYAN + " Singleton data value is: " + singleton.getData());

        // Get another reference to the Singleton
        // Is it the same object

        singleton = null;
        singleton = Singleton.getInstance();

        System.out.println(ConsoleColors.ANSI_PURPLE + "\n Second reference: " + singleton);
        System.out.println(ConsoleColors.ANSI_PURPLE + " Singleton data value is: " + singleton.getData());

    }
}
