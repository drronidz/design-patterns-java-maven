package com.course;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/4/2021 4:22 PM
*/

public class Client {
    public static void main(String[] args) {

        Vehicle car = new Car(new Produce(), new Assemble());
        car.manufacture();

        System.out.println("----------------------------------");

        Vehicle bike = new Bike(new Produce(), new Assemble());
        bike.manufacture();
    }
}
