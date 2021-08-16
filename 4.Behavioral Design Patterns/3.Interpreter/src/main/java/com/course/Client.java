package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/16/2021 2:24 AM
*/

public class Client {
    public InterpreterContext interpreterContext;

    public Client(InterpreterContext interpreterContext) {
        this.interpreterContext = interpreterContext;
    }

    public String interpret(String string) {
        Expression expression = null;

        // Perform the parsing
        int number = Integer.parseInt(string.substring(0, string.indexOf(" ")));
        if(string.contains("Hexadecimal")) {
            expression = new IntToHexExpression(number);
        } else if(string.contains("Binary")) {
            expression = new IntToBinaryExpression(number);
        } else {
            return string;
        }

        return expression.interpret(interpreterContext);
    }

    public static void main(String[] args) {
        String strOne = "28 in Binary";
        String strTwo = "28 in Hexadecimal";

        Client client = new Client(new InterpreterContext());

        System.out.println(strOne + " = " + client.interpret(strOne));
        System.out.println(strOne + " = " + client.interpret(strTwo));
    }
}
