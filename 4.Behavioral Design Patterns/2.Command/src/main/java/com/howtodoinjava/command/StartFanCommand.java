package com.howtodoinjava.command;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/15/2021 1:28 AM
*/

import com.howtodoinjava.receiver.Fan;

public class StartFanCommand implements ICommand{
    private final Fan fan;

    public StartFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.start();
    }
}
