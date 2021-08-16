package com.baeldung.client;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/16/2021 1:13 AM
*/

import com.baeldung.command.OpenTextFileOperation;
import com.baeldung.command.SaveTextFileOperation;
import com.baeldung.command.TextFileOperation;
import com.baeldung.invoker.TextFileOperationExecutor;
import com.baeldung.receiver.TextFile;

public class Client {
    public static void main(String[] args) {
        TextFileOperation openTextFileOperation = new OpenTextFileOperation(new TextFile("file_1.txt"));
        TextFileOperation saveTextFileOperation = new SaveTextFileOperation(new TextFile("file_2.text"));

        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();

        System.out.println(textFileOperationExecutor.executeOperation(openTextFileOperation));
        System.out.println(textFileOperationExecutor.executeOperation(saveTextFileOperation));

    }
}
