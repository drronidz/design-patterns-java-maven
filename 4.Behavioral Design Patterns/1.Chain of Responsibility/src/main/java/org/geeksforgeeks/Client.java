package org.geeksforgeeks;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/14/2021 2:06 AM
*/

public class Client {
    public static void main(String[] args) {
        Chain chain = new Chain();

        // Calling chain of responsibility
        chain.process(new Number(90));
        chain.process(new Number(91));
        chain.process(new Number(-50));
        chain.process(new Number(0));

    }
}
