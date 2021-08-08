package com.springhow;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/6/2021 12:34 AM
*/

public class Operand implements Evaluable {

    private int value;

    public Operand(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }
}
