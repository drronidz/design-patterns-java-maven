package com.course;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/28/2021 2:34 PM
*/

public class Client {
    public static void main(String[] args) {
        System.out.println("### com.com.example.course.Builder Pattern Demo ###\n");

        Director director = new Director();

        Builder carBuilder = new Car();
        Builder motorBuilder = new MotorCycle();

        // Making a car
        director.construct(carBuilder);
        Product productOne = carBuilder.getVehicle();
        productOne.show();

        // Making a motorcycle
        director.construct(motorBuilder);
        Product productTwo = motorBuilder.getVehicle();
        productTwo.show();

    }
}
