package guru.springframework.factory;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 10:16 PM
*/

import guru.springframework.topping.sauce.Sauce;
import guru.springframework.topping.cheese.Cheese;

public abstract class BaseToppingFactory {
    public abstract Cheese createCheese();
    public abstract Sauce createSauce();
}
