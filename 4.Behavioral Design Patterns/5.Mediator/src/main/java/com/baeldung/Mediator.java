package com.baeldung;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/19/2021 12:44 AM
*/

public class Mediator {
    private Button button;
    private Fan fan;
    private PowerSupplier powerSupplier;

    public void setButton(Button button) {
        this.button = button;
        this.button.setMediator(this);
    }

    public void setFan(Fan fan) {
        this.fan = fan;
        this.fan.setMediator(this);
    }

    public void setPowerSupplier(PowerSupplier powerSupplier) {
        this.powerSupplier = powerSupplier;
    }

    public void press() {
        if(fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void start() {
        powerSupplier.turnOn();
    }

    public void stop() {
        powerSupplier.turnOff();
    }
}
