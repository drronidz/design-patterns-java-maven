package com.challenge;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/4/2021 4:36 PM
*/

public class Red implements Color {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Red color with " + border + " inch border.");
    }
}
