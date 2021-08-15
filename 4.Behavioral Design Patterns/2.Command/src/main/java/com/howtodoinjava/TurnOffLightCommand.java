package com.howtodoinjava;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/15/2021 1:29 AM
*/



public class TurnOffLightCommand implements ICommand {
    private final Light light;

    public TurnOffLightCommand(Light light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }
}
