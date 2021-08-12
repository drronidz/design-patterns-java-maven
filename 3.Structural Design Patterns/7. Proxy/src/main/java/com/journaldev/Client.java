package com.journaldev;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 11:46 PM
*/

public class Client {
    public static void main(String[] args) {
        CommandExecutor executor =
                new CommandExecutorProxy("Pankaj","wrong_pwd");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand("rm -rf abc.pdf");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
