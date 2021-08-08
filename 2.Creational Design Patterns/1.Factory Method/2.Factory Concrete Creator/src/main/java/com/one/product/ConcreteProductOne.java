package com.one.product;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/22/2021 11:14 PM
*/

import com.tools.ConsoleColors;

public class ConcreteProductOne extends ConcreteProduct {
    @Override
    public String getName() {
        return ConsoleColors.ANSI_YELLOW +  "I'm product One ...";
    }
}
