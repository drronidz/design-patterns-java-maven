package com.javadesignpatterns.element;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 12:20 AM
*/

import com.javadesignpatterns.visitor.UnitVisitor;

import java.util.Arrays;

public interface Unit {
    void accept(UnitVisitor unitVisitor);
}
