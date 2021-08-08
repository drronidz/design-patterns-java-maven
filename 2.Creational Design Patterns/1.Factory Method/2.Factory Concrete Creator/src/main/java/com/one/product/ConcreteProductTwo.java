package com.one.product;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/22/2021 11:19 PM
*/

import com.tools.ConsoleColors;

public class ConcreteProductTwo extends ConcreteProduct {
    @Override
    public String getName() {
        return ConsoleColors.ANSI_GREEN +  "I'm product Two ...";
    }
}
