package com.tutorialspoint;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/22/2021 1:07 AM
*/

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state ...");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
