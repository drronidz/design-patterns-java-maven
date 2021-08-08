package com.challenge;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/4/2021 4:37 PM
*/

public class Green implements Color {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Green color with " + border + " inch border");
    }
}
