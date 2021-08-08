package com.baeldung.two.dao.implementations;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/19/2021 10:44 PM
*/

import main.com.example.two.dao.interfaces.CustomerDAO;
import main.com.example.two.entities.Customer;

import java.util.*;

public class SimpleCustomerDAO implements CustomerDAO {

    private Map<Integer, Customer> customers = new HashMap<>();

    public SimpleCustomerDAO(Map<Integer, Customer> customers) {
        this.customers = customers;
    }

    @Override
    public Optional<Customer> findByID(int id) {
        return Optional.ofNullable(customers.get(id));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }
}
