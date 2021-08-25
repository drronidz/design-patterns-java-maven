package guru.springframework;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 10:29 PM
*/

import guru.springframework.factory.BaseToppingFactory;
import guru.springframework.factory.SicilianToppingFactory;
import guru.springframework.product.CheesePizza;
import guru.springframework.product.PepperoniPizza;
import guru.springframework.product.Pizza;
import guru.springframework.product.VeggiePizza;

public class SicilianPizzaFactory extends BasePizzaFactory{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        BaseToppingFactory toppingFactory = new SicilianToppingFactory();
        pizza = switch (type.toLowerCase()) {
            case "cheese" -> new CheesePizza(toppingFactory);
            case "pepperoni" -> new PepperoniPizza(toppingFactory);
            case "veggie" -> new VeggiePizza(toppingFactory);
            default -> throw new IllegalArgumentException("No such pizza.");
        };
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
