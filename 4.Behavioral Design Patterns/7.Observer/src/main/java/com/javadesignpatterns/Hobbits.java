package com.javadesignpatterns;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/21/2021 12:54 AM
*/

public class Hobbits implements WeatherObserver {

    @Override
    public void update(WeatherType currentWeather) {
        System.out.println("Hobbits are facing :" + currentWeather.getDescription() + " weather now");
    }
}
