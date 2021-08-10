package com.dzone;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 2:03 AM
*/

import java.util.ArrayList;

public class CoffeeShop {
    private static final ArrayList<Order> orders = new ArrayList<>();

    public void takeOrder(CoffeeFlavour flavourName, CoffeeLatteArt latteArt, int tableNumber) {
        orders.add(Order.of(flavourName, latteArt, tableNumber));
    }

    public static int getNumberOfOrders() {
        return orders.size();
    }
}
