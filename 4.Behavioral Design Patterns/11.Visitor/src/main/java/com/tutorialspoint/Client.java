package com.tutorialspoint;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 12:58 AM
*/

import com.tutorialspoint.element.Computer;
import com.tutorialspoint.element.ComputerPart;
import com.tutorialspoint.visitor.ComputerPartDisplayVisitor;

public class Client {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
