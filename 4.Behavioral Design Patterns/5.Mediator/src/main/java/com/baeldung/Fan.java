package com.baeldung;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/19/2021 12:45 AM
*/

public class Fan {
    private Mediator mediator;
    private boolean isOn = false;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOff() {
        this.mediator.stop();
    }

    public void turnOn() {
        this.mediator.start();
    }
}
