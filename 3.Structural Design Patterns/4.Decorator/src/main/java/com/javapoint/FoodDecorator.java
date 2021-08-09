package com.javapoint;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/7/2021 1:11 AM
*/

public abstract class FoodDecorator implements Food {
    private Food food;

    public FoodDecorator(Food food) {
        this.food = food;
    }

    @Override
    public String prepareFood() {
        return food.prepareFood();
    }

    @Override
    public double foodPrice() {
        return food.foodPrice();
    }
}
