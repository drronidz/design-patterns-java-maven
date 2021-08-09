package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/7/2021 4:41 PM
*/

public class Amplifier {
    String description;
    Tuner tuner;
    DVDPlayer dvdPlayer;
    CDPlayer cdPlayer;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " On");
    }

    public void off() {
        System.out.println(description + " Off");
    }

    public void setStereoSound() {
        System.out.println(description + " stereo mode on");
    }

    public void setSurroundSound() {
        System.out.println(description + " surround sound on (5 speakers, 1 subwoofer");
    }

    public void setVolume(int level) {
        System.out.println(description + " setting volume to " + level);
    }

    public void setTuner(Tuner tuner) {
        System.out.println(description + " setting tuner to " + tuner);
        this.tuner = tuner;
    }

    public void setDVD(DVDPlayer dvdPlayer) {
        System.out.println(description + " setting DVD player to " + dvdPlayer);
        this.dvdPlayer = dvdPlayer;
    }

    public void setCD(CDPlayer cdPlayer) {
        System.out.println(description + " setting CD player to " + cdPlayer);
        this.cdPlayer = cdPlayer;
    }

    @Override
    public String toString() {
        return description;
    }
}
