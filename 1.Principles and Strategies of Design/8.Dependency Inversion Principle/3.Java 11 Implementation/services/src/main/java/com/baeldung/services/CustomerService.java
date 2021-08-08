package com.baeldung.services;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/20/2021 12:14 AM
*/

import com.baeldung.daos.CustomerDAO;
import com.baeldung.entities.Customer;

import java.util.List;
import java.util.Optional;

public class CustomerService {

    private final CustomerDAO customerDAO;

    public CustomerService(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public Optional<Customer> findByID (int id) {
        return customerDAO.findByID(id);
    }

    public List<Customer> findAll() {
        return customerDAO.findAll();
    }
}
