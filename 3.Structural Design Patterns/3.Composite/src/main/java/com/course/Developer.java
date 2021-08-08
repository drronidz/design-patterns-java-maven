package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/5/2021 3:37 PM
*/

import com.tools.ConsoleColors;

public class Developer implements Employee {
    private long id;
    private String name;
    private String position;

    public Developer(long id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(ConsoleColors.ANSI_GREEN + "Employee ID : " + id + ", Employee Name : " + name + ", Employee Position : " + position);
    }
}
