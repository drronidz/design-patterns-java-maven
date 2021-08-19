package com.programmergirl;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/19/2021 12:56 AM
*/

public interface AircraftMediator {
    public void registerRunway(Runway runway);
    public String allotRunwayTo(Aircraft aircraft);
    public void releaseRunwayOccupiedBy(Aircraft aircraft);
}
