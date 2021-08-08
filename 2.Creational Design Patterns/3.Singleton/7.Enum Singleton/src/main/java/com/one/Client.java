package com.one;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/29/2021 2:33 PM
*/

import com.tools.ConsoleColors;

public class Client {
    public static void main(String[] args) {
        System.out.println(ConsoleColors.ANSI_GREEN +"############### Singleton Enum ###############");
        Singleton singleton = Singleton.INSTANCE;
        System.out.println("Original Value : " + singleton.getValue());
        singleton.setValue(2);
        System.out.println("Updated Value : "+singleton.getValue());
    }
}
