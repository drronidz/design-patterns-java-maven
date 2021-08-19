package com.programmergirl;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/19/2021 1:11 AM
*/

public class Client {
    public static void main(String[] args) {
        Runway runwayA = new Runway("Runway A");
//        Runway runwayB = new Runway("Runway B");
//        Runway runwayC = new Runway("Runway C");

        AircraftMediator mediator = new AircraftTrafficControlRoom();
        mediator.registerRunway(runwayA);
//        mediator.registerRunway(runwayB);
//        mediator.registerRunway(runwayC);

        AircraftColleague boeing770 = new Aircraft(mediator, "Boeing 770");
        AircraftColleague airbusA380 = new Aircraft(mediator, "Airbus A380");

        boeing770.startLanding();
        airbusA380.startLanding();
        boeing770.finishLanding();
    }
}
