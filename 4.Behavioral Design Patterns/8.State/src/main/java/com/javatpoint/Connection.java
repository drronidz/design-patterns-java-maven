package com.javatpoint;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/22/2021 1:33 AM
*/


// We can call it also State
public interface Connection {
    void open();
    void close();
    void log();
    void update();
}
