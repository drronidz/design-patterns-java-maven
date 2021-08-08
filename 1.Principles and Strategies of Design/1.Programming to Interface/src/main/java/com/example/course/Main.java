package com.example.course;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/20/2021 7:40 PM
*/

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        DisplayModule displayModuleMonitor = new Monitor();
        DisplayModule displayModuleProjector = new Projector();

        computer.setDisplayModule(displayModuleMonitor);
        computer.display();

        computer.setDisplayModule(displayModuleProjector);
        computer.display();
    }
}
