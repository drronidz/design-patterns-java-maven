package guru.springframework.factory;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 10:19 PM
*/

import guru.springframework.topping.sauce.Sauce;
import guru.springframework.topping.sauce.TomatoSauce;
import guru.springframework.topping.cheese.Cheese;
import guru.springframework.topping.cheese.MozzarellaCheese;

public class SicilianToppingFactory extends BaseToppingFactory{
    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
