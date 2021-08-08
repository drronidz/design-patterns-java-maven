package com.two.dao.interfaces;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/19/2021 10:32 PM
*/

import com.two.entities.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDAO {
    Optional<Customer> findByID(int id);
    List<Customer> findAll();
}
