package com.challenge.movie;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/24/2021 1:54 AM
*/

import com.tools.ConsoleColors;

public class BollyWoodActionMovie implements BollyWoodMovie {
    @Override
    public String getMovieName() {
        return ConsoleColors.ANSI_CYAN + "Bang Bang is a Bollywood Action Movie";
    }
}
