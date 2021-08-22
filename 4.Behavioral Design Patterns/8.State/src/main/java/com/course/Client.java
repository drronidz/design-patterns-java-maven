package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/22/2021 1:00 AM
*/

public class Client {
    public static void main(String[] args) {
        System.out.println("------ State Pattern ------");

        // Initially TV is Off
        Off initialState = new Off();

        TV tv = new TV(initialState);


        // First Time press
        tv.pressButton();

        // Second Time press
        tv.pressButton();
    }
}
