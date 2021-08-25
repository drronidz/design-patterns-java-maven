package com.javadesignpatterns.element;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 12:23 AM
*/

import com.javadesignpatterns.visitor.UnitVisitor;

public class Sergeant implements Unit {

    @Override
    public void accept(UnitVisitor unitVisitor) {
        unitVisitor.visit(this);
    }

    @Override
    public String toString() {
        return "Sergeant";
    }
}
