package com.medium;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/6/2021 12:00 AM
*/

import java.util.ArrayList;
import java.util.List;

public class GrandParent implements Human {

    private String name;
    private String lastName;
    private List<Human> children ;

    public GrandParent(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.children = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void print() {
        System.out.println("---------------------------------------");
        System.out.println("Name : " + getName());
        System.out.println("Last name : " + getLastName());
        System.out.println("Children : ");
        for (Human child: children) {
            System.out.println(" - Name : " + child.getName());
        }
        System.out.println("---------------------------------------");
    }

    @Override
    public void addChild(Human child) {
        children.add(child);
    }

    @Override
    public void addParent(Human parent) {

    }
}
