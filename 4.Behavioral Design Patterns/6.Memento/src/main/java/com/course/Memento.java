package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/19/2021 4:22 PM
*/

public class Memento {
    private String fileName;
    private StringBuilder content;

    public Memento(String fileName, StringBuilder content) {
        this.fileName = fileName;
        /*
        * Notice the deep copy so that Memento and FileWriterUtil
        * content variables don't refer to same object
        * */
        this.content = new StringBuilder(content);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public StringBuilder getContent() {
        return content;
    }

    public void setContent(StringBuilder content) {
        this.content = content;
    }
}
