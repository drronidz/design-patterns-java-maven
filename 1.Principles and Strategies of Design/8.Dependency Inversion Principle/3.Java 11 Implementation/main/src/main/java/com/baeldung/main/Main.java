package com.baeldung.main;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/8/2021 3:34 PM
*/

import com.baeldung.daoimplementations.SimpleCustomerDAO;
import com.baeldung.entities.Customer;
import com.baeldung.services.CustomerService;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        var customers = new HashMap<Integer, Customer>();
        customers.put(1, new Customer("John"));
        customers.put(2, new Customer("Susan"));
        CustomerService customerService = new CustomerService(new SimpleCustomerDAO(customers));
        customerService.findAll().forEach(System.out::println);
    }
}
