package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/9/2021 4:05 PM
*/

public class Robot implements IRobot {

    String robotType;
    public String colorOfRobot;

    public Robot(String robotType) {
        this.robotType = robotType;
    }

    @Override
    public void print() {
        System.out.println(" This is a " +robotType+ " type robot with "+colorOfRobot+ "color");
    }

    @Override
    public void setColor(String colorOfRobot) {
        this.colorOfRobot=colorOfRobot;
    }
}
