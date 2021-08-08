package com.challenge.movie;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/24/2021 1:55 AM
*/

import com.tools.ConsoleColors;

public class BollyWoodComedyMovie implements BollyWoodMovie {
    @Override
    public String getMovieName() {
        return ConsoleColors.ANSI_GREEN + "Munna Bhai MBBS is a Bollywood Comedy Movie";
    }
}
