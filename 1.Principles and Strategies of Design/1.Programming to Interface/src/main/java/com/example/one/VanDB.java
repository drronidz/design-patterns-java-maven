package com.example.one;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/1/2021 5:27 PM
*/

import java.util.ArrayList;
import java.util.List;

public class VanDB implements Database{

    @Override
    public List<Vehicle> findAll() {
        List<Vehicle> vans = new ArrayList<>();
//        List<SqlRow> rows = Database.instance.all();
//        for(SqlRow row : rows) {
//            vans.add(new Vehicle(row));
//        }
        return vans;
    }
}
