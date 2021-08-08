package com.challenge.factory;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/24/2021 2:01 AM
*/

import com.challenge.movie.BollyWoodMovie;
import com.challenge.movie.HollyWoodMovie;

public interface MovieFactory {
    HollyWoodMovie getHollyWoodMovie(String type);
    BollyWoodMovie getBollyWoodMovie(String type);
}
