package com.baeldung;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/6/2021 11:50 PM
*/

public class Client {
    public static void main(String[] args) {
        // Christmas Tree with just one Garland
        ChristmasTree treeOne = new Garland(new ChristmasTreeImpl());
        System.out.println(treeOne.decorate());

        // Christmas Tree with two Garland and one Bubble lights
        ChristmasTree treeTwo = new BubbleLights(
                new Garland(
                        new Garland(
                                new ChristmasTreeImpl())));
        System.out.println(treeTwo.decorate());
    }
}
