package com.challenge;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/7/2021 11:18 PM
*/

public class NonVegMenu implements Menus{
    public NonVegMenu() {
        System.out.println("Creating a non veg menu");
    }

    @Override
    public void showMenu() {
        System.out.println("Menu items in non veg menu");
    }
}
