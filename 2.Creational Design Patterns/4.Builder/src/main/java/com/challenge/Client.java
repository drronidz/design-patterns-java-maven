package com.challenge;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/28/2021 4:31 PM
*/

import com.tools.ConsoleColors;
import com.challenge.builder.MealBuilder;
import com.challenge.builder.NonVegMealBuilder;
import com.challenge.builder.VegMealBuilder;

public class Client {
    public static void main(String[] args) {
        System.out.println(ConsoleColors.ANSI_RED + "### Meal Pattern Demo ###\n");

        Director director = new Director();

        MealBuilder vegMealBuilder = new VegMealBuilder();
        MealBuilder nonVegMealBuilder = new NonVegMealBuilder();

        director.construct(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();
        System.out.println(ConsoleColors.ANSI_GREEN + "Veg Meal");
        vegMeal.showItems();
        System.out.println(" Total Cost: " + vegMeal.getCost());

        System.out.println(ConsoleColors.ANSI_RESET + "###########################################");

        director.construct(nonVegMealBuilder);
        Meal nonVegMeal = nonVegMealBuilder.getMeal();
        System.out.println(ConsoleColors.ANSI_ORANGE + "Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());

    }
}
