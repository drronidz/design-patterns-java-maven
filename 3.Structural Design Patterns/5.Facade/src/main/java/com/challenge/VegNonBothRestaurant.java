package com.challenge;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/7/2021 11:24 PM
*/

public class VegNonBothRestaurant implements Hotel {
    @Override
    public Menus getMenus() {
        return new Both();
    }
}
