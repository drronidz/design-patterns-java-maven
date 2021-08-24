package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/24/2021 11:20 PM
*/

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
