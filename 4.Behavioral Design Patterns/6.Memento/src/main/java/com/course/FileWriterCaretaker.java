package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/19/2021 4:28 PM
*/

public class FileWriterCaretaker {
    private Object object;

    public void save(FileWriterUtil fileWriter) {
        this.object = fileWriter.save();
    }

    public void undo(FileWriterUtil fileWriter) {
        fileWriter.undoToLastSave(object);
    }
}
