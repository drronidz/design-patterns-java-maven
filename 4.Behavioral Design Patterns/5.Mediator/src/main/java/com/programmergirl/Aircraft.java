package com.programmergirl;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/19/2021 12:58 AM
*/

public class Aircraft implements AircraftColleague {
    private final AircraftMediator mediator;
    private final String flightName;

    public Aircraft(AircraftMediator mediator, String flightName) {
        this.mediator = mediator;
        this.flightName = flightName;
    }

    @Override
    public void startLanding() {
        String runway = this.mediator.allotRunwayTo(this);
        if(runway == null) {
            // Informing passenger
            System.out.println("Due to traffic, there's a delay in landing of " + this.flightName);
        } else {
            System.out.println("Currently landing " + this.flightName + " on " + runway);
        }
    }

    @Override
    public void finishLanding() {
        System.out.println(this.flightName + " landed successfully");
        this.mediator.releaseRunwayOccupiedBy(this);
    }
}
