package com.riptutorial;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/8/2021 12:43 AM
*/

public class BookingMaker {
    private final FlightBooking flightBooking;
    private final TrainBooking trainBooking;
    private final HotelBooking hotelBooking;

    public BookingMaker() {
        flightBooking = new FlightBooking();
        trainBooking = new TrainBooking();
        hotelBooking = new HotelBooking();
    }

    public void book (BookingType type, BookingInformation information) {
        switch (type) {
            case FLIGHT:
                // Book Flight
                flightBooking.bookFlight(information);
                break;
            case HOTEL:
                // Book Hotel
                hotelBooking.bookHotel(information);
                break;
            case TRAIN:
                // Book Train
                trainBooking.bookTrain(information);
                break;
            case FLIGHT_AND_HOTEL:
                // Book Flight & Hotel
                flightBooking.bookFlight(information);
                hotelBooking.bookHotel(information);
                break;
            case TRAIN_AND_HOTEL:
                // Book Train & Hotel
                trainBooking.bookTrain(information);
                hotelBooking.bookHotel(information);
                break;
        }
    }
}
