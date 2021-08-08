package com.challenge;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/3/2021 12:38 AM
*/

public class MP4Player implements AdvancedMediaPlayer {
    String file;
    @Override
    public void loadFileName(String fileName) {
        file = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing MP4 file. Name: " + file);
    }
}
