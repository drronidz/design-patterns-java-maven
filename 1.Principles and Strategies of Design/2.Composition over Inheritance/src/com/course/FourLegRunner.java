package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/1/2021 5:55 PM
*/

public class FourLegRunner implements Runnable {

    @Override
    public void run(int speed) {
        System.out.println("Running with Four legs & " + speed + " mph.");
    }
}
