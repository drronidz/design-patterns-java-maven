package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/21/2021 2:46 AM
*/



public class Client {
    private Service service;

    // Injects via the constructor
    public Client(Service service) {
        this.service = service;
    }

    public void doSomething() {
        service.write("This is a message");
    }

    public void setService(Service service) {
        this.service = service;
    }
}
