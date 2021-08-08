package com.two.factory;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/23/2021 12:30 AM
*/

import com.two.vehicule.Car;
import com.two.vehicule.Truck;
import com.two.vehicule.Vehicle;

public class ConcreteCreatorVehicle implements Creator<Vehicle> {
    @Override
    public Vehicle create(String type) {
        return switch (type) {
            case "Car" -> new Car();
            case "Truck" -> new Truck();
            default -> null;
        };
    }
}
