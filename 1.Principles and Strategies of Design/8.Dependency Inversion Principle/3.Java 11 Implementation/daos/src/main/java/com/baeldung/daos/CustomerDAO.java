package com.baeldung.daos;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/8/2021 3:24 PM
*/

import com.baeldung.entities.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDAO {
    Optional<Customer> findByID(int id);
    List<Customer> findAll();
}
