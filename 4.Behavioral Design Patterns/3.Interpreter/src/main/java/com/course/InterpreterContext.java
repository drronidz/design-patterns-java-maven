package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/16/2021 2:16 AM
*/

public class InterpreterContext {

    // Number in Binary
    public String getBinaryFormat(int number) {
        return Integer.toBinaryString(number);
    }
    // Number in Hexadecimal
    public String getHexadecimalFormat(int number) {
        return Integer.toHexString(number);
    }

}
