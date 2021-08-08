package com.baeldung.daoimplementations;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/8/2021 3:23 PM
*/

import com.baeldung.daos.CustomerDAO;
import com.baeldung.entities.Customer;

import java.util.*;

public class SimpleCustomerDAO implements CustomerDAO {

    private Map<Integer, Customer> customers = new HashMap<>();

    public SimpleCustomerDAO() {
    }

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
