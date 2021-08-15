package com.programcreek.client;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/15/2021 1:05 AM
*/

import com.programcreek.command.Command;
import com.programcreek.command.RestartCommand;
import com.programcreek.command.ShutDownCommand;
import com.programcreek.command.SleepCommand;
import com.programcreek.invoker.Switch;
import com.programcreek.receiver.Computer;

public class Client {
    public static void main(String[] args) {
        handleSwitch("shutdown");
        System.out.println("----------------");
        handleSwitch("restart");
        System.out.println("----------------");
        handleSwitch("sleep");
        System.out.println("----------------");
        handleSwitch("start");
    }

    public static void handleSwitch(String command) {

        Computer computer = new Computer();

        Command shutdown = new ShutDownCommand(computer);
        Command restart = new RestartCommand(computer);
        Command sleep = new SleepCommand(computer);

        Switch s = new Switch();

        //String shutdownSTR = "restart"; // get value based on real situation
        switch (command) {
            case "shutdown" -> s.storeAndExecute(shutdown);
            case "restart" -> s.storeAndExecute(restart);
            case "sleep" -> s.storeAndExecute(sleep);
            default -> System.out.println("No command like this !");
        }
    }
}
