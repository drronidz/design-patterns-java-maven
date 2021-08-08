package com.baeldung;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/3/2021 1:21 AM
*/



public class Client {
    public static void main(String[] args) {

        System.out.println("#####-- Adapter Example --#####");
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
        System.out.println("Bugatti Veyron top speed is : " +bugattiVeyron.getSpeed() + " MPH.");
        System.out.println("Bugatti Veyron top speed is : " +bugattiVeyronAdapter.getSpeed() + " KMPH.");

        System.out.println();

        Movable mcLaren = new McLaren();
        MovableAdapter mcLarenAdapter = new MovableAdapterImpl(mcLaren);
        System.out.println("McLaren F1 top speed is : " +mcLaren.getSpeed() + " MPH.");
        System.out.println("McLaren F1 top speed is : " +mcLarenAdapter.getSpeed() + " KMPH.");

        System.out.println();

        Movable astonMartin = new AstonMartin();
        MovableAdapter astonMartinAdapter = new MovableAdapterImpl(astonMartin);
        System.out.println("Aston Martin top speed is : " +astonMartin.getSpeed() + " MPH.");
        System.out.println("Aston Martin top speed is : " +astonMartinAdapter.getSpeed() + " KMPH.");


    }
}
