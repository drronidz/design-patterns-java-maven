package com.challenge.builder;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/28/2021 4:26 PM
*/

import com.challenge.Meal;
import com.challenge.item.burger.VegBurger;
import com.challenge.item.drink.Coke;

public class VegMealBuilder implements MealBuilder {

    private Meal vegMeal = new Meal();

    @Override
    public void buildBurger() {
        vegMeal.addItem(new VegBurger());
    }

    @Override
    public void buildDrink() {
        vegMeal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return vegMeal;
    }
}
