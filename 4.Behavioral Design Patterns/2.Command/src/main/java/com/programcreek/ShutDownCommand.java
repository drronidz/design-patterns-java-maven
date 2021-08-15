package com.programcreek;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/15/2021 12:55 AM
*/

// The command for restarting the computer
public class ShutDownCommand implements Command{
    private final Computer computer;

    public ShutDownCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        this.computer.shutDown();
    }
}
