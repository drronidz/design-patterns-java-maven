package guru.springframework;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 10:27 PM
*/

import guru.springframework.product.Pizza;

public abstract class BasePizzaFactory {
    public abstract Pizza createPizza(String type);
}
