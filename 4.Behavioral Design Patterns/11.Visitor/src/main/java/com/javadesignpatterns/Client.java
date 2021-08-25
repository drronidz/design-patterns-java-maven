package com.javadesignpatterns;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 12:49 AM
*/


import com.javadesignpatterns.element.Commander;
import com.javadesignpatterns.element.Soldier;
import com.javadesignpatterns.element.Unit;
import com.javadesignpatterns.visitor.UnitDisplayVisitor;

public class Client {
    public static void main(String[] args) {
        Unit commander = new Commander();

        commander.accept(new UnitDisplayVisitor());
        commander.accept(new UnitDisplayVisitor());
        commander.accept(new UnitDisplayVisitor());
    }
}
