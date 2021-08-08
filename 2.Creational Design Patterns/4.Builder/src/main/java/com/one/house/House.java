package com.one.house;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/29/2021 3:45 PM
*/

public class House implements HousePlan {

    private String basement;
    private String structure;
    private String roof;
    private String interior;

    @Override
    public void setBasement(String basement) {
        this.basement = basement;
    }

    @Override
    public void setStructure(String structure) {
        this.structure = structure;
    }

    @Override
    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public void setInterior(String interior) {
        this.interior = interior;
    }
}
