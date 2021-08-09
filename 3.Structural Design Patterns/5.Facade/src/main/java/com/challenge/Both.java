package com.challenge;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/7/2021 11:20 PM
*/

public class Both implements Menus {
    public Both() {
        System.out.println("Creating both a non and veg menu");
    }

    @Override
    public void showMenu() {
        System.out.println("Menu items in both a veg and non menu");
    }
}
