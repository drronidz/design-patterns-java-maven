package com.two;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/29/2021 4:30 PM
*/

public class Client {
    public static void main(String[] args) {
       // Using builder o get the object in a single ine of code
       // and without any inconsistent state or arguments management issues
        Computer computer = new Computer.ComputerBuilder("500 GB", "4 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
    }
}
