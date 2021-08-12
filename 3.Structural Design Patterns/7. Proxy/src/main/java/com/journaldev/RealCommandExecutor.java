package com.journaldev;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 11:40 PM
*/

public class RealCommandExecutor implements CommandExecutor {
    @Override
    public void runCommand(String cmd) throws Exception {
        // Some heavy implementation
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}
