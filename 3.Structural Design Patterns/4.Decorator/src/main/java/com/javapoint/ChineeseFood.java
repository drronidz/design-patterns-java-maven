package com.javapoint;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/7/2021 1:17 AM
*/

public class ChineeseFood  extends FoodDecorator {

    public ChineeseFood(Food food) {
        super(food);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + decorateChineeseFood();
    }

    @Override
    public double foodPrice() {
        return super.foodPrice() + chineeseFoodOption();
    }

    public String decorateChineeseFood (){
        return " With Fried Rice and Manchurian";
    }

    public double chineeseFoodOption () {
        return 65;
    }
}
