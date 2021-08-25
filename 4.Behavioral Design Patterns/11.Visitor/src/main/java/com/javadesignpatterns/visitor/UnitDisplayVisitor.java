package com.javadesignpatterns.visitor;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 1:30 AM
*/

import com.javadesignpatterns.element.Commander;
import com.javadesignpatterns.element.Sergeant;
import com.javadesignpatterns.element.Soldier;

public class UnitDisplayVisitor implements UnitVisitor{
    @Override
    public void visit(Soldier soldier) {
        System.out.println("Hello " + soldier);
    }

    @Override
    public void visit(Sergeant sergeant) {
        System.out.println("Greetings " + sergeant);
    }

    @Override
    public void visit(Commander commander) {
        System.out.println("Nice to meet you " + commander);
    }
}
