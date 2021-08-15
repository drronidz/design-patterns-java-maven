package com.programcreek;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/15/2021 12:57 AM
*/

// The command for shutting down the computer
public class RestartCommand implements Command {
    private final Computer computer;

    public RestartCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        this.computer.restart();
    }
}
