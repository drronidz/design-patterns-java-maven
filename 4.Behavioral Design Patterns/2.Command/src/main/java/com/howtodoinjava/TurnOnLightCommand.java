package com.howtodoinjava;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/15/2021 1:29 AM
*/

import com.programcreek.Command;

public class TurnOnLightCommand implements ICommand {
    private final Light light;

    public TurnOnLightCommand(Light light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOn();
    }
}
