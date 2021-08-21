package com.javadesignpatterns;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/21/2021 12:53 AM
*/

public class Orcs implements WeatherObserver{
    @Override
    public void update(WeatherType currentWeather) {
        System.out.println("Orcs are facing " + currentWeather.getDescription() + " weather now");
    }
}
