package com.baeldung;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/5/2021 11:44 PM
*/

public class FinancialDepartment implements Departement {

    private Integer id;
    private String name;

    // standard constructor,
    public FinancialDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public FinancialDepartment() {
    }

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
    // Getters, Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
