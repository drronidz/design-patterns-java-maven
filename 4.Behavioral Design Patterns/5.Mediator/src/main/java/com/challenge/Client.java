package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/19/2021 12:22 AM
*/

public class Client {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new AuctionMediator();

        Buyer buyer_1 = new AuctionBuyer(auctionMediator, "Jason");
        Buyer buyer_2 = new AuctionBuyer(auctionMediator, "John");
        Buyer buyer_3 = new AuctionBuyer(auctionMediator, "David");

        // Create and add buyers

        auctionMediator.addBuyer(buyer_1);
        auctionMediator.addBuyer(buyer_2);
        auctionMediator.addBuyer(buyer_3);

        System.out.println("Welcome to the auction. " +
                "Tonight we are selling a vacation to Vegas. " +
                "please Bid your offers.");
        System.out.println("--------------------------------------");
        System.out.println("Waiting for the buyer's offers ...");

        // Making bids
        buyer_1.makeBid(1800);
        buyer_2.makeBid(2000);
        buyer_3.makeBid(1200);


        System.out.println("--------------------------------------");
        auctionMediator.findHighestBidder();

        buyer_2.cancelTheBid();
        System.out.println(buyer_2.name + " has canceled his bid!, in that case ");

        auctionMediator.findHighestBidder();
    }
}
