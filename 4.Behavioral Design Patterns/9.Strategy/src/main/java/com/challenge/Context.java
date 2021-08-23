package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/23/2021 2:21 AM
*/

public class Context {
    public int executeStrategy(Strategy strategy, int numberOne, int numberTwo) {
        return strategy.performOperation(numberOne, numberTwo);
    }
}
