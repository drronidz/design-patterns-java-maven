package com.challenge;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/7/2021 11:24 PM
*/

public class HotelKeeper {

    public VegMenu getVegMenu() {
        VegRestaurant vegRestaurant = new VegRestaurant();
        return (VegMenu) vegRestaurant.getMenus();
    }

    public NonVegMenu getNonVegMenu() {
        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
        return (NonVegMenu) nonVegRestaurant.getMenus();
    }

    public Both getBothMenu() {
        VegNonBothRestaurant vegNonBothRestaurant = new VegNonBothRestaurant();
        return (Both) vegNonBothRestaurant.getMenus();
    }
}
