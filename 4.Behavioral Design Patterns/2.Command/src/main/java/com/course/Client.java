package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/14/2021 4:11 PM
*/

public class Client {
    public static void main(String[] args) {

        // Creating the receiver
        FileSystemReceiver fileSystemReceiver = FileSystemReceiverUtil.getUnderlyingFileSystem();

        // Creating the command with the associating receiver
        Command openFileCommand = new OpenFileCommand(fileSystemReceiver);

        // Create invoker and associate it with the command
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);


        // Perform action on invoker object
        fileInvoker.execute();


        System.out.println("-----------------------------------------------------");

        // Perform write operation using FileInvoker and WriteFileCommand
        Command writeFileCommand = new WriteFileCommand(fileSystemReceiver);
        fileInvoker = new FileInvoker(writeFileCommand);
        fileInvoker.execute();

        System.out.println("-----------------------------------------------------");

        // Perform close operation using FileInvoker and WriteFileCommand
        Command closeFileCommand  = new CloseFileCommand(fileSystemReceiver);
        fileInvoker = new FileInvoker(closeFileCommand);
        fileInvoker.execute();


    }
}
