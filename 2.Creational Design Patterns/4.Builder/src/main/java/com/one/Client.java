package com.one;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/29/2021 3:42 PM
*/

import com.one.house.House;
import com.one.house.builder.HouseBuilder;
import com.one.house.builder.IglooHouseBuilder;

public class Client {
    public static void main(String[] args) {

        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);

        engineer.constuct();

        House house = engineer.getHouse();

        System.out.println("Builder constructed : " + house);
    }
}
