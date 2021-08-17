package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/17/2021 11:35 PM
*/

public interface Iterator {
    public void first(); // Reset to first element
    public String next(); // get next element
    public boolean isDone(); // End of collection check
    public String currentItem(); // Retrieve current Item
}
