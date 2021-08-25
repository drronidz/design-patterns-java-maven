package guru.springframework;

import guru.springframework.product.Pizza;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 10:37 PM
*/

class GourmetPizzaFactoryTest {
    private BasePizzaFactory pizzaFactory;

    @BeforeEach
    void setUp() {
        pizzaFactory = new GourmetPizzaFactory();
    }

    @Test
    void createPizzaTest() {
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
}