package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/24/2021 12:34 AM
*/

public class Client {
    public static void main(String[] args) {
        System.out.println("----------- Wooden House -----------");
        HouseTemplate houseType = new WoodenHouse();

        // using template method
        houseType.buildHouse();


        System.out.println("----------- Glass House -----------");

        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
