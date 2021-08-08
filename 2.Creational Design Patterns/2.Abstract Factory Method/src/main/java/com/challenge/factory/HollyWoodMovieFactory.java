package com.challenge.factory;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/24/2021 2:18 AM
*/

import com.challenge.movie.BollyWoodMovie;
import com.challenge.movie.HollyWoodActionMovie;
import com.challenge.movie.HollyWoodComedyMovie;
import com.challenge.movie.HollyWoodMovie;

public class HollyWoodMovieFactory implements MovieFactory {
    @Override
    public HollyWoodMovie getHollyWoodMovie(String type) {
        return switch (type) {
            case "action" -> new HollyWoodActionMovie();
            case "comedy" -> new HollyWoodComedyMovie();
            default -> null;
        };
    }

    @Override
    public BollyWoodMovie getBollyWoodMovie(String type) {
        return null;
    }
}
