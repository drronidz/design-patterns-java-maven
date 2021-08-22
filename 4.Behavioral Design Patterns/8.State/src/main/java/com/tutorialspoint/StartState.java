package com.tutorialspoint;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/22/2021 1:06 AM
*/

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state ...");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
