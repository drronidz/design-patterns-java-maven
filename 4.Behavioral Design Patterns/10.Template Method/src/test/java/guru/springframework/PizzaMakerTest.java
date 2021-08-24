package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/24/2021 1:32 AM
*/

class PizzaMakerTest {
    @Test
    void makePizzaTest() {
        System.out.println("-------- Making Veg Pizza --------");
        PizzaTemplate vegPizzaMaker = new VegPizzaMaker();
        vegPizzaMaker.makePizza();

        System.out.println("-------- Making Non Veg Pizza --------");
        PizzaTemplate nonVegPizzaMaker = new NonVegPizzaMaker();
        nonVegPizzaMaker.makePizza();

        System.out.println("----------- Making In-House Assorted Pizza");
        PizzaTemplate inHouseAssortedPizza = new InHouseAssortedPizzaMaker();
        inHouseAssortedPizza.makePizza();
    }
}