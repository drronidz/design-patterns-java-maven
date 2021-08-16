package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/16/2021 2:19 AM
*/

public class IntToBinaryExpression implements Expression {
    private final int number;

    public IntToBinaryExpression(int number) {
        this.number = number;
    }

    @Override
    public String interpret(InterpreterContext context) {
        return context.getBinaryFormat(number);
    }
}
