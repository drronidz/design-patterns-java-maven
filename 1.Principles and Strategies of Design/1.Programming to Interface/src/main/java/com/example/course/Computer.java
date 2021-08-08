package com.example.course;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/20/2021 7:37 PM
*/

public class Computer {
    DisplayModule displayModule ;

    public void setDisplayModule(DisplayModule displayModule) {
        this.displayModule = displayModule;
    }
    public void display() {
        displayModule.display();
    }
}
