package com.baeldung.two.main;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/19/2021 10:30 PM
*/

import main.com.example.two.dao.implementations.SimpleCustomerDAO;
import main.com.example.two.entities.Customer;
import main.com.example.two.services.CustomerService;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Customer> customers = new HashMap<>();
        customers.put(1, new Customer(1,"John"));
        customers.put(2, new Customer(2,"Alex"));

        CustomerService customerService = new CustomerService(new SimpleCustomerDAO(customers));
        customerService.findAll().forEach(System.out::println);
    }
}
