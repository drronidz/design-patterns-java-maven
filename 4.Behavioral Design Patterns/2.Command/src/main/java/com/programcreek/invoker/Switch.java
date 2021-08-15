package com.programcreek.invoker;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/15/2021 12:52 AM
*/

import com.programcreek.command.Command;

import java.util.ArrayList;
import java.util.List;

// This is the invoker class
// in this example, suppose you use a switch to control computer
public class Switch {
    private final List<Command> history = new ArrayList<>();

    public Switch() {
    }

    public void storeAndExecute(Command command) {
        this.history.add(command); // optional, can do the execute only ..!
        command.execute();
    }
}
