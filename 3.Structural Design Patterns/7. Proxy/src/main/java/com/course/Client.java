package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 4:15 PM
*/

public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("someFileName.jpeg");

        // image will be loaded from the disk
        image.display();
        System.out.println("");

        image.display();
    }
}
