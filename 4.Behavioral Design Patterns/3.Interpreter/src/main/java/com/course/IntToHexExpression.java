package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/16/2021 2:21 AM
*/

public class IntToHexExpression implements Expression {
    private final int number;

    public IntToHexExpression(int number) {
        this.number = number;
    }


    @Override
    public String interpret(InterpreterContext context) {
        return context.getHexadecimalFormat(number).toUpperCase();
    }
}
