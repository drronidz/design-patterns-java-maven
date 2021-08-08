package com.challenge.builder;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/28/2021 4:28 PM
*/

import com.challenge.Meal;
import com.challenge.item.burger.ChickenBurger;
import com.challenge.item.drink.Pepsi;

public class NonVegMealBuilder implements MealBuilder {

    private Meal nonVegMeal = new Meal();

    @Override
    public void buildBurger() {
        nonVegMeal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        nonVegMeal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return nonVegMeal;
    }
}
