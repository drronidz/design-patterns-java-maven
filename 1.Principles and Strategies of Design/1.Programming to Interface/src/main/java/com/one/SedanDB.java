package com.one;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/1/2021 5:26 PM
*/

import java.util.ArrayList;
import java.util.List;

public class SedanDB implements Database{

    @Override
    public List<Vehicle> findAll() {
        List<Vehicle> sedans = new ArrayList<>();
//        List<SqlRow> rows = Database.instance.all();
//        for(SqlRow row : rows) {
//            sedans.add(new Vehicle(row));
//        }
        return sedans;
    }
}