package com.journaldev;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 11:42 PM
*/

public class CommandExecutorProxy implements CommandExecutor {
    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String password) {
        if("Pankaj".equals(user) && "J@urnalD$v".equals(password)) {
            isAdmin = true;
        }
        executor = new RealCommandExecutor();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if(isAdmin) {
            executor.runCommand(cmd);
        } else {
            if(cmd.trim().startsWith("rm")) {
                throw new Exception("rm command is not allowed for non-admin users.");
            } else {
                executor.runCommand(cmd);
            }
        }
    }
}
