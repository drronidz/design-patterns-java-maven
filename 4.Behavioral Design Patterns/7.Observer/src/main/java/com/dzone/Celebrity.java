package com.dzone;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/21/2021 1:25 AM
*/

import java.util.ArrayList;
import java.util.List;

public class Celebrity implements Subject{
    private final List<Observer> observers ;
    private String name;
    private final String handle;

    public Celebrity(String name, String handle) {
        super();
        this.name = name;
        this.handle = "#" + handle;
        observers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHandle() {
        return handle;
    }

    public void tweet(String tweet) {
        System.out.printf("\nName: %s, Tweet: %s\n", name, tweet);
        notifySubscriber(tweet);
    }

    @Override
    public synchronized void addSubscriber(Observer observer) {
        observers.add(observer);
    }

    @Override
    public synchronized void removeSubscriber(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscriber(String tweet) {
        observers.forEach(observer -> observer.notification(handle, tweet));
    }
}
