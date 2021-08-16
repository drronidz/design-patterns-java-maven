package com.baeldung.receiver;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/16/2021 12:50 AM
*/

public class TextFile {
    private final String name;

    public TextFile(String name) {
        this.name = name;
    }

    public String open() {
        return "Opening File : " + name;
    }

    public String read() {
        return "Reading File : " + name;
    }

    public String write() {
        return "Writing to File : " + name;
    }

    public String save() {
        return "Saving File : " + name;
    }

    public String copy() {
        return "Copying File : " + name;
    }

    public String paste() {
        return "Pasting File : " + name;
    }
}
