package com.baeldung;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/21/2021 2:29 AM
*/



public class Client {
    // Internal reference to the service used by this client
    private final ExampleService exampleService;

    public Client() {
        // Specify a specific implementation in the constructor instead of using Dependency Injection
        this.exampleService = new ExampleService();
    }

    // Method within this client tht uses the services
    public String greet() {
        return "Hello " + exampleService.getName();
    }
}
