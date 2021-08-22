package com.javatpoint;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/22/2021 1:35 AM
*/

public class Management implements Connection{
    @Override
    public void open() {
        System.out.println("Open database for management ...");
    }

    @Override
    public void close() {
        System.out.println("Close the database ...");
    }

    @Override
    public void log() {
        System.out.println("Log activities ...");
    }

    @Override
    public void update() {
        System.out.println("Management has been updated ...");
    }
}
