package com.javapoint;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/7/2021 12:59 AM
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        int choice;
        do {
            System.out.println("---------------------- FOOD MENU ---------------------- \n");
            System.out.println(" 1. Basic Food.");
            System.out.println(" 2. Non-Vegetarian Food.");
            System.out.println(" 3. Chinese Food.");
            System.out.println(" 4. Exit.");

            System.out.println("--------------------- Enter Your Choice ---------------------");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            choice = Integer.parseInt(bufferedReader.readLine());

            switch (choice) {
                case 1 : {
                    Food basicFood = new BasicFood();
                    System.out.println(basicFood.prepareFood());
                    System.out.println(basicFood.foodPrice());
                } break;

                case 2 : {
                    Food nonVegFood = new NonVegFood(new BasicFood());
                    System.out.println(nonVegFood.prepareFood());
                    System.out.println(nonVegFood.foodPrice());
                } break;

                case 3 : {
                    Food chineseFood = new ChineeseFood(new BasicFood());
                    System.out.println(chineseFood.prepareFood());
                    System.out.println(chineseFood.foodPrice());
                } break;
                default : {
                    System.out.println("Other than these no Food available");
                }
            }
        }
        while (choice != 4);
    }
}
