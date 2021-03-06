package com.two.services;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/19/2021 10:32 PM
*/

import com.two.dao.interfaces.CustomerDAO;
import com.two.entities.Customer;

import java.util.List;
import java.util.Optional;

public class CustomerService {

    private final CustomerDAO customerDAO;

    public CustomerService(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public Optional<Customer> findByID(int id) {
        return customerDAO.findByID(id);
    }

    public List<Customer> findAll() {
        return customerDAO.findAll();
    }
}
