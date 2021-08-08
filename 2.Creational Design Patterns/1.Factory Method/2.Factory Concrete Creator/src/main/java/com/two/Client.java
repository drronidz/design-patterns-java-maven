package com.two;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/23/2021 12:18 AM
*/

import com.tools.ConsoleColors;
import com.two.factory.ConcreteCreatorProduct;
import com.two.factory.ConcreteCreatorVehicle;
import com.two.factory.Creator;
import com.two.product.Product;
import com.two.vehicule.Vehicle;

public class Client {
    public static void main(String[] args) {

        Creator<Product> productCreator = new ConcreteCreatorProduct();
        Product productOne = productCreator.create("ConcreteProductOne");
        Product productTwo = productCreator.create("ConcreteProductTwo");

        System.out.println(ConsoleColors.ANSI_PURPLE + productOne.getName());
        System.out.println(ConsoleColors.ANSI_GREEN  + productTwo.getName());

        System.out.println(ConsoleColors.ANSI_RED + "----------------------------------------------");

        Creator<Vehicle> vehicleCreator = new ConcreteCreatorVehicle();
        Vehicle car = vehicleCreator.create("Car");
        Vehicle truck = vehicleCreator.create("Truck");

        System.out.println(ConsoleColors.ANSI_CYAN + car.move());
        System.out.println(ConsoleColors.ANSI_YELLOW  + truck.move());


    }
}
