package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/24/2021 12:48 AM
*/

public class Client {
    public static void main(String[] args) {
        OrderProcessTemplate netOrder = new NetOrder();
        netOrder.processOrder(true);

        System.out.println("-------- We changed the template to a store order --------");

        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder(true);
    }
}
