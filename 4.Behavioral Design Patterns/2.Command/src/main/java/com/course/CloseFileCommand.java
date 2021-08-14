package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/14/2021 4:07 PM
*/

public class CloseFileCommand implements Command {
    private final FileSystemReceiver fileSystemReceiver;

    // store previous stat for undo, String someState.


    public CloseFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        // save previous sate, in case undo called someState = ... ;
        this.fileSystemReceiver.closeFile();
    }
}
