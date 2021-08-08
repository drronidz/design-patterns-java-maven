package com.baeldung;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/21/2021 1:01 AM
*/

public class Main {
    public static void main(String[] args) {

        CalculatorOperation additionOperation =  new Addition(1,2);
        CalculatorOperation divisionOperation = new Division(5,4);
        CalculatorOperation subtractionOperation = new Subtraction(5,4);

        Calculator calculator = new Calculator();

        calculator.calculate(additionOperation);
        calculator.calculate(divisionOperation);
        calculator.calculate(subtractionOperation);

        // Printing results
        System.out.println(additionOperation);
        System.out.println(divisionOperation);
        System.out.println(subtractionOperation);



    }
}
