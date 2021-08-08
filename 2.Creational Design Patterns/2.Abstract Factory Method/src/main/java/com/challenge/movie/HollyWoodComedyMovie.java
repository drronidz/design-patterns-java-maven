package com.challenge.movie;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/24/2021 1:58 AM
*/

import com.tools.ConsoleColors;

public class HollyWoodComedyMovie implements HollyWoodMovie {
    @Override
    public String getMovieName() {
        return ConsoleColors.ANSI_ORANGE + "The Jerk is a Hollywood Comedy Movie";
    }
}
