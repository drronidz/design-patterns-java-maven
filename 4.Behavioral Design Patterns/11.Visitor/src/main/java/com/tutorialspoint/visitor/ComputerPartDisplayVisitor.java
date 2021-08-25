package com.tutorialspoint.visitor;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 1:07 AM
*/

import com.tutorialspoint.element.Computer;
import com.tutorialspoint.element.Keyboard;
import com.tutorialspoint.element.Monitor;
import com.tutorialspoint.element.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer ...");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse ...");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard ...");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor ...");
    }
}
