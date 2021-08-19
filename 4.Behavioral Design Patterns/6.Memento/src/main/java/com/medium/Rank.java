package com.medium;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/19/2021 11:10 PM
*/


import java.io.FileNotFoundException;
import java.io.UncheckedIOException;

public class Rank {
    protected int performance;
    protected HealthState healthState;
    protected String rank;

    public Rank(int performance, HealthState healthState) {
        this.performance = performance;
        this.healthState = healthState;
        rankGenerator(performance, healthState);
    }

    // This method will generate the rank based on performance and health state
    public void rankGenerator(int performance, HealthState healthState) {

        if (performance > 80 && healthState == HealthState.HEALTHY) {
            rank = "Excellent";
        } else if (performance > 80 && healthState == HealthState.UNHEALTHY) {
            rank = "Good";
        } else if (performance > 50 && healthState == HealthState.HEALTHY) {
            rank = "Average";
        } else if (performance > 50 && healthState == HealthState.UNHEALTHY) {
            rank = "Poor";
        } else {
            rank = "Very Poor";
        }
    }

    @Override
    public String toString() {
        return "Rank = '" + rank + '\'' +
                "}";
    }
}
