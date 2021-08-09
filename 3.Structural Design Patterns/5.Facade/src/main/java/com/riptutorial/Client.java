package com.riptutorial;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/8/2021 12:49 AM
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        int choice;
        BookingInformation bookingInformation = new BookingInformation();
        bookingInformation.destination = "London";
        bookingInformation.source = "Setif";
        do {
            System.out.println(" --------------------- CHOICE BOOKING --------------------- ");
            System.out.println(" 1. FLIGHT BOOKING \n");
            System.out.println(" 2. TRAIN BOOKING \n");
            System.out.println(" 3. HOTEL BOOKING \n");
            System.out.println(" 4. FLIGHT + HOTEL BOOKING \n");
            System.out.println(" 5. TRAIN + HOTEL BOOKING \n");
            System.out.println(" 6. EXIT \n");

            System.out.println("ENTER YOUR CHOICE: ");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(bufferedReader.readLine());
            BookingMaker bookingMaker = new BookingMaker();

            switch (choice) {
                case 1 -> bookingMaker.book(BookingType.FLIGHT, bookingInformation);
                case 2 -> bookingMaker.book(BookingType.TRAIN, bookingInformation);
                case 3 -> bookingMaker.book(BookingType.HOTEL, bookingInformation);
                case 4 -> bookingMaker.book(BookingType.FLIGHT_AND_HOTEL, bookingInformation);
                case 5 -> bookingMaker.book(BookingType.TRAIN_AND_HOTEL, bookingInformation);
                default -> System.out.println("Nothing you booked");
            }
        }
        while (choice !=6);
    }
}
