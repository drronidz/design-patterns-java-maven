package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/19/2021 4:24 PM
*/

public class FileWriterUtil {
    private String fileName;
    private StringBuilder content;

    public FileWriterUtil(String fileName) {
        this.fileName = fileName;
        this.content = new StringBuilder();
    }

    public void write(String str) {
        content.append(str);
    }

    // Creates the memento
    public Memento save() {
        return new Memento(this.fileName, this.content);
    }

    // restore into its earlier state
    public void undoToLastSave(Object object) {
        Memento memento = (Memento) object;
        this.fileName = memento.getFileName();
        this.content = memento.getContent();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }
}
