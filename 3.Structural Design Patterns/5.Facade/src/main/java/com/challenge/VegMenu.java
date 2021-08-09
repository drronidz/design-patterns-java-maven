package com.challenge;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/7/2021 11:19 PM
*/



public class VegMenu implements Menus {
    public VegMenu() {
        System.out.println("Creating a veg Menu menu");
    }

    @Override
    public void showMenu() {
        System.out.println("Menu items in veg menu");
    }
}
