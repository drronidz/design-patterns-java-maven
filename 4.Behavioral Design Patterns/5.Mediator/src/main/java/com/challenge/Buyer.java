package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/19/2021 12:09 AM
*/

public abstract class Buyer {
    // This class holds the buyer
    protected Mediator mediator;
    protected String name;
    protected int price;

    public Buyer(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void makeBid(int price);
    public abstract void cancelTheBid();
    public abstract void auctionHasEnded();
}
