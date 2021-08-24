package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/24/2021 11:21 PM
*/

public class Fruit implements ItemElement {
    private final int pricePerKG;
    private final int weight;
    private final String name;


    public Fruit(int pricePerKG, int weight, String name) {
        this.pricePerKG = pricePerKG;
        this.weight = weight;
        this.name = name;
    }

    public int getPricePerKG() {
        return this.pricePerKG;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
