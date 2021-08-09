package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/7/2021 4:41 PM
*/

public class CDPlayer {
    String title;
    String description;
    int currentTrack;
    Amplifier amplifier;

    public CDPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println(description + " On ");
    }

    public void off() {
        System.out.println(description + " Off ");
    }

    public void eject() {
        title = null;
        System.out.println(description + " Eject ");
    }

    public void play(String title) {
        this.title = title;
        currentTrack = 0;
        System.out.println(description + " playing \"" + title + "\"");
    }

    public void play(int track) {
        if(title == null) {
            System.out.println(description + " can't play track " + currentTrack + ", o cd inserted");
        } else {
            currentTrack = track;
            System.out.println(description + " playing track " + currentTrack);
        }
    }

    public void stop() {
        currentTrack = 0;
        System.out.println(description + " stopped");
    }

    public void pause() {
        System.out.println(description + " paused \"" + title + "\"");
    }

    @Override
    public String toString() {
        return description;
    }
}
