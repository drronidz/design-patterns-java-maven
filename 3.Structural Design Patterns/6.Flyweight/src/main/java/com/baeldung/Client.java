package com.baeldung;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 1:27 AM
*/

import java.awt.*;
import java.util.Random;

public class Client {

    private static final Color [] colors = {Color.BLACK, Color.BLUE, Color.GRAY, Color.WHITE};

    private static final Type [] vehicles = {Type.BIKE,Type.CAR, Type.BUS};

    public static void main(String[] args) {

        Engine carEngine = new Engine();
        Engine bikeEngine = new Engine();
        Engine busEngine = new Engine();

        for (int i = 0; i < 5; i++) {
            switch (getRandomVehicleType()) {
                case BUS -> {
                    System.out.println("---------------------------------------");
                    Vehicle bus = VehicleFactory.createVehicle(Type.BUS, getRandomColor(),busEngine);
                    bus.print();
                    bus.start();
                    bus.stop();
                    System.out.println(bus.hashCode());
                    System.out.println("---------------------------------------");
                }
                case CAR -> {
                    System.out.println("---------------------------------------");
                    Vehicle car = VehicleFactory.createVehicle(Type.CAR, getRandomColor(),carEngine);
                    car.print();
                    car.start();
                    car.stop();
                    System.out.println(car.hashCode());
                    System.out.println("---------------------------------------");
                }
                case BIKE -> {
                    System.out.println("---------------------------------------");
                    Vehicle bike = VehicleFactory.createVehicle(Type.BIKE, getRandomColor(),bikeEngine);
                    bike.print();
                    bike.start();
                    bike.stop();
                    System.out.println(bike.hashCode());
                    System.out.println("---------------------------------------");
                }
            }
        }

    }

    public static Color getRandomColor() {
        Random random = new Random();

        int randomInteger = random.nextInt(colors.length);

        return colors[randomInteger];
    }

    public static Type getRandomVehicleType() {
        Random random = new Random();

        int randomInteger = random.nextInt(vehicles.length);

        return vehicles[randomInteger];
    }
}
