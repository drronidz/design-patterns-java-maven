package com.javatpoint;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/7/2021 11:32 PM
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        int choice;
        do {
            System.out.println(" --------------------- Mobile Shop --------------------- ");
            System.out.println(" 1. IPHONE \n");
            System.out.println(" 2. SAMSUNG \n");
            System.out.println(" 3. BLACKBERRY \n");
            System.out.println(" 4. EXIT \n");

            System.out.println("ENTER YOUR CHOICE: ");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(bufferedReader.readLine());
            ShopKeeper shopKeeper = new ShopKeeper();

            switch (choice) {
                case 1 -> shopKeeper.iphoneSale();
                case 2 -> shopKeeper.samsungSale();
                case 3 -> shopKeeper.blackberrySale();
                default -> System.out.println("Nothing you purchased");
            }

        }
        while (choice !=4);
    }
}
