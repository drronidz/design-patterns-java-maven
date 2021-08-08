package com.challenge.builder;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/28/2021 4:25 PM
*/

import com.challenge.Meal;

public interface MealBuilder {
    void buildBurger();
    void buildDrink();
    Meal getMeal();
}
