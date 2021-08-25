package guru.springframework.builder;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 11:06 PM
*/

import guru.springframework.product.House;

public class PrefabricatedHouseBuilder implements HouseBuilder{
    private final House house;

    public PrefabricatedHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Wood, laminate, and PVC flooring");
        System.out.println(this.getClass().getSimpleName() + "");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Structural steels and wooden wall panels");
        System.out.println(this.getClass().getSimpleName() + "");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Roofing sheets");
        System.out.println(this.getClass().getSimpleName() + "");
    }

    @Override
    public void paintHouse() {
        house.setPainted(false);
        System.out.println(this.getClass().getSimpleName() + "Painting not required ...");
    }

    @Override
    public void furnishHouse() {
        house.setFurnished(true);
        System.out.println(this.getClass().getSimpleName() + "Furnishing complete ...");
    }

    @Override
    public House getHouse() {
        System.out.println(this.getClass().getSimpleName() + "Prefabricated house complete ...");
        return this.house;
    }
}
