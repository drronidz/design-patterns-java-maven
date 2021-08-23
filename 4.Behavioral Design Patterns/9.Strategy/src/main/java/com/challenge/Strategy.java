package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/23/2021 2:19 AM
*/

public interface Strategy {
    int performOperation(int numberOne, int numberTwo);
}

class OperationAdd implements Strategy {


    @Override
    public int performOperation(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
}

class OperationSubtract implements Strategy {


    @Override
    public int performOperation(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }
}

class OperationMultiply implements Strategy {


    @Override
    public int performOperation(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }
}

class OperationDivision implements Strategy {


    @Override
    public int performOperation(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }
}