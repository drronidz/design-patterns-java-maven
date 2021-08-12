package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 4:14 PM
*/

public class ProxyImage implements Image {
    private RealImage realImage;
    private final String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("display()::ProxyImage");
        if(realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
