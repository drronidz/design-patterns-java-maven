package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/19/2021 12:13 AM
*/

import java.util.ArrayList;

public class AuctionMediator implements Mediator{
    /* this class implements the mediator interface and holds all the buyers in
     an ArrayList. We can add buyers and find the highest bidder.
     */
    private final ArrayList<Buyer> buyers;

    public AuctionMediator() {
        buyers = new ArrayList<Buyer>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
        System.out.println(buyer.name + " was added to the buyers list.");
    }

    @Override
    public void findHighestBidder() {
        int maxBid = 0;
        Buyer winner = null;
        for(Object a : buyers) {
            Buyer b = (Buyer) a;
            if(b.price > maxBid) {
                maxBid = b.price;
                winner = b;
            }
        }

        assert winner != null;
        System.out.println("The auction winner is " + winner.name + ". He paid " + winner.price + "$ for the item.");

        for(Object a : buyers) {
            Buyer b = (Buyer) a;
            b.auctionHasEnded();
        }
    }
}
