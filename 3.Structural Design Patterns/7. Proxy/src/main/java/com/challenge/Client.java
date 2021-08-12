package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 11:09 PM
*/

public class Client {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("jasonfedin.org");
            internet.connectTo("whatever.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
