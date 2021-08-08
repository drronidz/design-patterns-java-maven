package com.one;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/20/2021 7:22 PM
*/



public class Client {
    private Service service;

    // Dependency Injection via the constructor :
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
