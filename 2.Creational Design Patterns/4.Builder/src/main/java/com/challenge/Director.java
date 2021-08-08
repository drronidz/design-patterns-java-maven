package com.challenge;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/28/2021 4:30 PM
*/

import com.challenge.builder.MealBuilder;

public class Director {
    MealBuilder mealBuilder;

    public void construct(MealBuilder builder) {
        mealBuilder = builder;
        mealBuilder.buildBurger();
        mealBuilder.buildDrink();
    }
}
