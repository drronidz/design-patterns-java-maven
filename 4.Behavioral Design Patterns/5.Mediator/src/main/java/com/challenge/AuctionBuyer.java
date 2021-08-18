package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/19/2021 12:12 AM
*/

public class AuctionBuyer extends Buyer {

    public AuctionBuyer(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void makeBid(int price) {
        this.price = price;
    }

    @Override
    public void cancelTheBid() {
        this.price = -1;
    }

    @Override
    public void auctionHasEnded() {
        System.out.println("Received message that the auction is over : " + name);
    }
}
