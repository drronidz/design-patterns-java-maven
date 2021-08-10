package com.dzone;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 1:59 AM
*/

public class Order {
    protected Coffee coffee;

    public Order(Coffee coffee) {
        super();
        this.coffee = coffee;
    }

    public static Order of(CoffeeFlavour flavourName, CoffeeLatteArt latteArt, int tableNumber) {
        Coffee coffee = CoffeeFactory.makeCoffee(flavourName, latteArt);
        System.out.printf("Serving to table '%d'.\n", tableNumber);
        System.out.println("-----------------------------------------------");
        return new Order(coffee);
    }

    public Coffee getCoffee() {
        return coffee;
    }
}
