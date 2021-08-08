package com.one;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/20/2021 7:24 PM
*/


public class Main {
    public static void main(String[] args) {
        Service service = new ServiceA(); // The Injector
        Client client = new Client(service); // Injects via the constructor
        client.doSomething();
        client.setService(service); // Injects via the Setter.
    }
}
