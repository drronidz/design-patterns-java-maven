package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/19/2021 4:28 PM
*/

public class Client {
    public static void main(String[] args) {

        FileWriterCaretaker caretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First Set of Data:\nMyra\nLucy\n");

        System.out.println(fileWriter + "\n\n");

        //lets save the file
        caretaker.save(fileWriter);

        // now write something else
        fileWriter.write("Second set of data:\nJason\n");

        // checking file contents
        System.out.println(fileWriter + "\n\n");

        // lets undo the last save
        caretaker.undo(fileWriter);

        // checking file content again
        System.out.println(fileWriter + "\n\n");
    }
}
