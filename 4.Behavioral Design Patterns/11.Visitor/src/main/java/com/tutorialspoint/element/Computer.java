package com.tutorialspoint.element;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 1:01 AM
*/

import com.tutorialspoint.visitor.ComputerPartVisitor;

import java.util.Arrays;

public class Computer implements ComputerPart{

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[] {
                new Mouse(),
                new Keyboard(),
                new Monitor(),
        };
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        Arrays.stream(parts).forEach(child -> child.accept(computerPartVisitor));
        computerPartVisitor.visit(this);
    }
}
