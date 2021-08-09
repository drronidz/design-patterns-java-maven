package com.challenge;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/7/2021 11:21 PM
*/

public class NonVegRestaurant implements Hotel {
    @Override
    public Menus getMenus() {
        return new NonVegMenu();
    }
}
