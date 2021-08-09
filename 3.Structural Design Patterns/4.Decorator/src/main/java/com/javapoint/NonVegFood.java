package com.javapoint;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/7/2021 1:13 AM
*/

public class NonVegFood extends FoodDecorator {
    public NonVegFood(Food food) {
        super(food);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + decorateNonVegFood();
    }

    @Override
    public double foodPrice() {
        return super.foodPrice() + nonVegFoodOption();
    }

    private String decorateNonVegFood () {
        return " With Roasted Chicken and Chicken Curry";
    }

    private double nonVegFoodOption () {
        return 150.00;
    }
}
