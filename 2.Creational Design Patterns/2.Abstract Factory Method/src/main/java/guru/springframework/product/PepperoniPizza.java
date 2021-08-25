package guru.springframework.product;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 10:25 PM
*/

import guru.springframework.factory.BaseToppingFactory;

public class PepperoniPizza extends Pizza{
    BaseToppingFactory toppingFactory;

    public PepperoniPizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for pepperoni pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
