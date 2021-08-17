package com.javacodegeeks;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/17/2021 5:28 PM
*/

public class Shape {
    private int id;
    private String name;

    public Shape(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shape { " +
                "id=" + id +
                ", name='" + name + '\'' +
                " }";
    }
}
