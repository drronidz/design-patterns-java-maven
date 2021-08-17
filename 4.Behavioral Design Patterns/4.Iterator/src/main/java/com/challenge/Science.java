package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/17/2021 11:43 PM
*/

import java.util.LinkedList;

public class Science implements Subject{
    private final LinkedList<String> subjects;

    public Science() {
        this.subjects = new LinkedList<>();
        this.subjects.addLast("Maths");
        this.subjects.addLast("Physics");
        this.subjects.addLast("Biology");
    }

    @Override
    public Iterator createIterator() {
        return new ScienceIterator(subjects);
    }
}
