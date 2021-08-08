package com.challenge;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/1/2021 2:15 PM
*/

import com.challenge.factory.FactoryProducer;
import com.challenge.factory.MovieFactory;
import com.challenge.movie.BollyWoodMovie;
import com.challenge.movie.HollyWoodMovie;
import com.tools.ConsoleColors;

public class Client {
    public static void main(String[] args) {
        System.out.println(ConsoleColors.ANSI_RESET +
                "----------------------- Holly Wood Movies -----------------------");

        MovieFactory hollyWoodMovieFactory = FactoryProducer.getFactory("HollyWoodMovie");
        HollyWoodMovie hollyAction = hollyWoodMovieFactory.getHollyWoodMovie("action");
        HollyWoodMovie hollyComedy = hollyWoodMovieFactory.getHollyWoodMovie("comedy");

        System.out.println("Holly Wood movies are: ");
        System.out.println(hollyAction.getMovieName());
        System.out.println(hollyComedy.getMovieName());

        System.out.println(ConsoleColors.ANSI_RESET +
                "----------------------- Boly Wood Movies -----------------------");

        MovieFactory bollyWoodMovieFactory = FactoryProducer.getFactory("BollyWoodMovie");
        BollyWoodMovie bollyAction = bollyWoodMovieFactory.getBollyWoodMovie("action");
        BollyWoodMovie bollyComedy = bollyWoodMovieFactory.getBollyWoodMovie("comedy");

        System.out.println("Bolly Wood movies are: ");
        System.out.println(bollyAction.getMovieName());
        System.out.println(bollyComedy.getMovieName());
    }
}
