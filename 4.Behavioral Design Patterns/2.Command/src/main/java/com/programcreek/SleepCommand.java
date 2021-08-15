package com.programcreek;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/15/2021 1:13 AM
*/

public class SleepCommand implements Command {
    private final Computer computer;

    public SleepCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        this.computer.sleep();
    }
}
