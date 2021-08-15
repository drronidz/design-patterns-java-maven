package com.howtodoinjava;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/15/2021 1:24 AM
*/

import com.programcreek.Command;

public class StopFanCommand implements ICommand {
    private final Fan fan;

    public StopFanCommand(Fan fan) {
        this.fan = fan;
    }


    @Override
    public void execute() {
        this.fan.stop();
    }
}
