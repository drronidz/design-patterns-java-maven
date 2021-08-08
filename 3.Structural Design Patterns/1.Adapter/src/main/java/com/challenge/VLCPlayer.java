package com.challenge;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/3/2021 12:36 AM
*/

public class VLCPlayer implements AdvancedMediaPlayer {
    String file;
    @Override
    public void loadFileName(String fileName) {
        file = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing VLC file. Name: " + file);
    }
}
