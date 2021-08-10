package com.dzone;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 2:06 AM
*/

public class Main {
    public static void main(String[] args) {

        CoffeeShop shop = new CoffeeShop();

        shop.takeOrder(CoffeeFlavour.COPPUCCINO, CoffeeLatteArt.BARISTA_SWAG, 5);
        shop.takeOrder(CoffeeFlavour.AFFOGATO, CoffeeLatteArt.FRENCH, 7);
        shop.takeOrder(CoffeeFlavour.ESPRESSO, CoffeeLatteArt.FISHBONE, 1);
        shop.takeOrder(CoffeeFlavour.LATTE, CoffeeLatteArt.DISNEY, 3);
        shop.takeOrder(CoffeeFlavour.COPPUCCINO, CoffeeLatteArt.CAT, 2);
        shop.takeOrder(CoffeeFlavour.ESPRESSO, CoffeeLatteArt.FISHBONE, 8);
        shop.takeOrder(CoffeeFlavour.AFFOGATO, CoffeeLatteArt.BARISTA_SWAG, 4);
        shop.takeOrder(CoffeeFlavour.COPPUCCINO, CoffeeLatteArt.DISNEY, 10);
        shop.takeOrder(CoffeeFlavour.LATTE, CoffeeLatteArt.LITTLE_BUNNY, 6);
        shop.takeOrder(CoffeeFlavour.FRAPPUCCINO, CoffeeLatteArt.DISNEY, 9);

        System.out.println("Number of Order Objects: " + CoffeeShop.getNumberOfOrders());

        System.out.println("Number of Coffee Objects: " + CoffeeFactory.getNumberOfCoffee());
    }
}
