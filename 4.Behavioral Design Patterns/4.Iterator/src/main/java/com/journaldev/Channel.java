package com.journaldev;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/18/2021 12:39 AM
*/

public class Channel {
    private final double frequency;
    private final ChannelType type;

    public Channel(double frequency, ChannelType type) {
        this.frequency = frequency;
        this.type = type;
    }

    public double getFrequency() {
        return frequency;
    }

    public ChannelType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Channel { " +
                "Frequency = " + frequency +
                ", Type = " + type +
                " }";
    }
}
