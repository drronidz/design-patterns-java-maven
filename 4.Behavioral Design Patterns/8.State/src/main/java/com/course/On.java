package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/22/2021 12:58 AM
*/

public class On extends RemoteControl{
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already On. Going to be Off now ...");
        context.setState(new Off());
    }
}
