package com.javadesignpatterns;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/21/2021 12:55 AM
*/

import java.util.ArrayList;
import java.util.List;

public class Weather {

    private WeatherType currentWeather;
    private final List<WeatherObserver> observers;

    public Weather() {
        this.currentWeather = WeatherType.RAINY;
        this.observers = new ArrayList<>();
    }

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    /*
    * Make time pass for the weather ...
    * */

    public void timePasses() {
        var enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        System.out.println("The Weather changed to : " + currentWeather);
        notifyObservers();
    }

    private void notifyObservers() {
        for (var observer: observers) {
            observer.update(currentWeather);
        }
    }
}
