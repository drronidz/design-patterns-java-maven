package com.challenge.movie;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/24/2021 1:56 AM
*/

import com.tools.ConsoleColors;

public class HollyWoodActionMovie implements HollyWoodMovie {
    @Override
    public String getMovieName() {
        return ConsoleColors.ANSI_PURPLE + "True Lies is a Hollywood Action Movie";
    }
}
