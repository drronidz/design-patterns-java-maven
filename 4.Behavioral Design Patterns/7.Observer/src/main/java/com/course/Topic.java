package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/21/2021 12:09 AM
*/

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject{

    private final List<Observer> observers;
    private String message;
    private boolean changed;

    public Topic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if(observer == null) {
            throw new NullPointerException("Null Observer");
        }
        if(!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;

        if(!changed) return;

        observersLocal = new ArrayList<>(this.observers);
        this.changed = false;

        for(Observer observer : observersLocal) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    // Method to post message to the topic, change state (trigger notifications)
    public void postMessage(String msg) {
        System.out.println("Message Posted to Topic:" + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }
}
