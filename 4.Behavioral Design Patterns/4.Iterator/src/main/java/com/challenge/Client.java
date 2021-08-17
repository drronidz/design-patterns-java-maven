package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/17/2021 11:46 PM
*/

public class Client {
    public static void main(String[] args) {
        System.out.println(" ----- Iterator Pattern DEMO -----");

        Subject science_subject = new Science();
        Subject arts_subject = new Arts();

        Iterator science_iterator = science_subject.createIterator();
        Iterator arts_iterator = arts_subject.createIterator();

        System.out.println("\n Science subjects : ");
        print(science_iterator);

        System.out.println("\n Arts subjects : ");
        print(arts_iterator);
    }

    public static void print(Iterator iterator) {
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }
}
