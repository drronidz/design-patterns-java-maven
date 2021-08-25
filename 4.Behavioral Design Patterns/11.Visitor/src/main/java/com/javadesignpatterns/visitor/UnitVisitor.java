package com.javadesignpatterns.visitor;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 12:22 AM
*/

import com.javadesignpatterns.element.Commander;
import com.javadesignpatterns.element.Sergeant;
import com.javadesignpatterns.element.Soldier;

public interface UnitVisitor {
    void visit(Soldier soldier);
    void visit(Sergeant sergeant);
    void visit(Commander commander);
}
