package guru.springframework.director;

import guru.springframework.builder.ConcreteHouseBuilder;
import guru.springframework.builder.HouseBuilder;
import guru.springframework.builder.PrefabricatedHouseBuilder;
import guru.springframework.product.House;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 11:13 PM
*/

class ConstructionEngineerTest {
    private ConstructionEngineer engineerA;
    private ConstructionEngineer engineerB;

    @BeforeEach
    void setUp() {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        engineerA = new ConstructionEngineer(concreteHouseBuilder);

        HouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
        engineerB = new ConstructionEngineer(prefabricatedHouseBuilder);
    }

    @Test
    void constructHouseTest() {
        House houseA = engineerA.construct();
        System.out.println("House is: " + houseA);

        House houseB = engineerB.construct();
        System.out.println("House is: " + houseB);
    }
}