package com.baeldung;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/21/2021 1:07 AM
*/



import java.security.InvalidParameterException;

public class Calculator {
    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Can not perform operation");
        }
        operation.perform();
    }
}
