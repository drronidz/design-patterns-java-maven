package com.course;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/28/2021 2:22 PM
*/

import com.tools.ConsoleColors;

import java.util.LinkedList;

public class Product {
    private LinkedList<String> parts;

    public Product () {
        parts = new LinkedList<String>();
    }

    public void add(String part) {
        parts.addLast(part);
    }

    public void show() {
        System.out.println(ConsoleColors.ANSI_YELLOW + "\n com.com.example.course.Product completed as below :");
        for (String part : parts) {
            System.out.println(ConsoleColors.ANSI_CYAN + part);
        }
    }
}
