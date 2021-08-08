package com.one;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/1/2021 5:27 PM
*/

import java.util.ArrayList;
import java.util.List;

public class CoupeDB implements Database{

    @Override
    public List<Vehicle> findAll() {
        List<Vehicle> coupes = new ArrayList<>();
//        List<SqlRow> rows = Database.instance.all();
//        for(SqlRow row : rows) {
//            coupes.add(new Vehicle(row));
//        }
        return coupes;
    }
}

