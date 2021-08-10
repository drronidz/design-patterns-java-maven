package com.baeldung;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 12:53 AM
*/

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    private static final HashMap<Type,Vehicle> vehiclesCache = new HashMap<>();

    public VehicleFactory() {
    }

    public static Vehicle createVehicle(Type type, Color color, Engine engine) {
        Vehicle vehicle = null;

        if(vehiclesCache.containsKey(type)) {
            vehicle = vehiclesCache.get(type);
        } else {
            switch (type) {
                case CAR -> {
                    System.out.println("Car Created !");
                    vehicle = new Car(engine, color);
                }
                case BUS ->  {
                    System.out.println("Bus Created !");
                    vehicle = new Bus(engine, color);
                }
                case BIKE -> {
                    System.out.println("Bike Created !");
                    vehicle = new Bike(engine,color);
                }
                default -> System.out.println("We have only these types !");
            }
            vehiclesCache.put(type, vehicle);
        }

        return vehicle;
    }
}
