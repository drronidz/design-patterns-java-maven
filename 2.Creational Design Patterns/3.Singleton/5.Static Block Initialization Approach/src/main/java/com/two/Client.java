package com.two;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/29/2021 2:04 PM
*/

import com.tools.ConsoleColors;

public class Client {
    public static void main(String[] args) {
        System.out.println(ConsoleColors.ANSI_PURPLE + "#########################################");
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }
}
