package com.challenge.factory;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/24/2021 2:19 AM
*/

import com.challenge.movie.BollyWoodActionMovie;
import com.challenge.movie.BollyWoodComedyMovie;
import com.challenge.movie.BollyWoodMovie;
import com.challenge.movie.HollyWoodMovie;

public class BollyWoodMovieFactory implements MovieFactory {


    @Override
    public BollyWoodMovie getBollyWoodMovie(String type) {
        return switch (type) {
            case "action" -> new BollyWoodActionMovie();
            case "comedy" -> new BollyWoodComedyMovie();
            default -> null;
        };
    }

    @Override
    public HollyWoodMovie getHollyWoodMovie(String type) {
        return null;
    }
}
