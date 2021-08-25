package guru.springframework.builder;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 11:01 PM
*/

import guru.springframework.product.House;

public class ConcreteHouseBuilder implements HouseBuilder{
    private final House house;

    public ConcreteHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete, brick, and stone");
        System.out.println(this.getClass().getSimpleName() + ": Foundation complete ...");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Concrete, mortar, brick, and reinforced steel");
        System.out.println(this.getClass().getSimpleName() + ": Structure complete ...");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Concrete and reinforced steel");
        System.out.println(this.getClass().getSimpleName() + ": Roof complete ...");
    }

    @Override
    public void paintHouse() {
        house.setPainted(true);
        System.out.println(this.getClass().getSimpleName() + ": Painting complete ...");
    }

    @Override
    public void furnishHouse() {
        house.setFurnished(true);
        System.out.println(this.getClass().getSimpleName() + ": Furnish complete ...");
    }

    @Override
    public House getHouse() {
        System.out.println(this.getClass().getSimpleName() + ": Concrete House complete ...");
        return this.house;
    }
}
