package com.one;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/1/2021 5:28 PM
*/

import java.util.List;

public class Printer {
    // Coding for implementation & not for interface

//    private com.one.TruckDB truckDB ;
//    private com.one.SedanDB sedanDB ;
//    private com.one.CoupeDB coupeDB ;
//    private com.one.VanDB vanDB ;

    // Coding for interface & not for implementation

    private Database database;

    public Printer(Database database) {
        this.database = database;
    }

    public void print(String type) {
        List<Vehicle> vehicles;

        // Coding for implementation & not for interface

//        switch (type) {
//            case "sedan" -> vehicles = sedanDB.findAll();
//            case "truck" -> vehicles = truckDB.findAll();
//            case "coupe" -> vehicles = coupeDB.findAll();
//            default -> throw new IllegalStateException("Unexpected value: " + type);
//        }

        // Coding for interface & not for implementation

        vehicles = this.database.findAll();
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }
}
