package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/7/2021 4:41 PM
*/

public class Client {
    public static void main(String[] args) {

        Amplifier amplifier = new Amplifier("Top-0-Line Amplifier");
        Tuner tuner = new Tuner("Top-0-Line AM/FM Tuner", amplifier);
        DVDPlayer dvdPlayer = new DVDPlayer("Top-0-Line DVD Player", amplifier);
        CDPlayer cdPlayer = new CDPlayer("Top-0-Line CD Player", amplifier);
        Projector projector = new Projector("Top-0-Line Projector", dvdPlayer);
        TheaterLights theaterLights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popcornPopper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                amplifier,
                tuner,
                dvdPlayer,
                cdPlayer,
                projector,
                theaterLights,
                screen,
                popcornPopper
        );

        homeTheater.watchMovie("Inception");
        System.out.println("------------------------------------------------------");
        homeTheater.endMovie();
    }
}
