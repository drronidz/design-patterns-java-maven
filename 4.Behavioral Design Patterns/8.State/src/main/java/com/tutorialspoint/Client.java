package com.tutorialspoint;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/22/2021 1:08 AM
*/

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(" ------- " + context.getState().toString() + " ------- ");

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(" ------- " + context.getState().toString() + " ------- ");
    }
}
