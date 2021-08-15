package com.howtodoinjava;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/15/2021 1:32 AM
*/

public class HomeAutomationRemote {

    //Command Holder
    ICommand command;

    // Set the command in runtime to trigger
    public void setCommand(ICommand command) {
        this.command = command;
    }

    // Will call the command interface method so that particular command can be invoked
    public void buttonPressed() {
        command.execute();
    }
}
