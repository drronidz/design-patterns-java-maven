package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/21/2021 2:48 AM
*/


public class Main {
    public static void main(String[] args) {
        Service service = new ServiceA(); // The Injector
        Client client = new Client(service); // Injects via the constructor
        client.doSomething();

        client.setService(service); // Injects via the Setter Injection
    }
}
