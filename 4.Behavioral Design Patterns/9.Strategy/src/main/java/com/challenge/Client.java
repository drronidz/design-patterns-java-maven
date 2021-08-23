package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/23/2021 2:22 AM
*/

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        int number_1 = 10;
        int number_2 = 5;
        int result;

        result = context.executeStrategy(new OperationAdd(), number_1, number_2);
        System.out.println(+ number_1 + " + " + number_2 + " = " + result);

        result = context.executeStrategy(new OperationSubtract(), number_1, number_2);
        System.out.println(+ number_1 + " - " + number_2 + " = " + result);

        result = context.executeStrategy(new OperationMultiply(), number_1, number_2);
        System.out.println(+ number_1 + " * " + number_2 + " = " + result);

        result = context.executeStrategy(new OperationDivision(), number_1, number_2);
        System.out.println(+ number_1 + " / " + number_2 + " = " + result);
    }
}
