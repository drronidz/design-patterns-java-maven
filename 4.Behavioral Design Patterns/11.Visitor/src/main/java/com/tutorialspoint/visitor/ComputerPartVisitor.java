package com.tutorialspoint.visitor;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 1:00 AM
*/

import com.tutorialspoint.element.Computer;
import com.tutorialspoint.element.Keyboard;
import com.tutorialspoint.element.Monitor;
import com.tutorialspoint.element.Mouse;

public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
