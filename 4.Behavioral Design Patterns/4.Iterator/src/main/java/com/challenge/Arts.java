package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/17/2021 11:41 PM
*/

public class Arts implements Subject {
    private final String[] subjects;

    public Arts() {
        this.subjects = new String [3];
        subjects [0] = "Arabic";
        subjects [1] = "English";
        subjects [2] = "French";
    }

    @Override
    public Iterator createIterator() {
        return new ArtsIterator(subjects);
    }
}
