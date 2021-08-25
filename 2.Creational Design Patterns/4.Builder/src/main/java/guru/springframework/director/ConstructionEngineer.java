package guru.springframework.director;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 10:56 PM
*/

import guru.springframework.builder.HouseBuilder;
import guru.springframework.product.House;

public class ConstructionEngineer {
    private final HouseBuilder houseBuilder;

    public ConstructionEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House construct() {
        this.houseBuilder.buildFoundation();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.paintHouse();
        this.houseBuilder.furnishHouse();
        return this.houseBuilder.getHouse();
    }
}
