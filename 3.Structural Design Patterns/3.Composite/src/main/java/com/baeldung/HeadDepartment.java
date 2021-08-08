package com.baeldung;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/5/2021 11:48 PM
*/

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Departement {

    private Integer id;
    private String name;

    private List<Departement> childDepartments;

    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        childDepartments.forEach(Departement::printDepartmentName);
    }

    public void addDepartment(Departement departement) {
        childDepartments.add(departement);
    }

    public void removeDepartment(Departement departement) {
        childDepartments.remove(departement);
    }
}
