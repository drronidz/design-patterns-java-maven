package guru.springframework.factory;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 10:20 PM
*/

import guru.springframework.topping.sauce.CaliforniaOilSauce;
import guru.springframework.topping.sauce.Sauce;
import guru.springframework.topping.cheese.Cheese;
import guru.springframework.topping.cheese.GoatCheese;

public class GourmetToppingFactory extends BaseToppingFactory{
    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Sauce createSauce() {
        return new CaliforniaOilSauce();
    }
}
