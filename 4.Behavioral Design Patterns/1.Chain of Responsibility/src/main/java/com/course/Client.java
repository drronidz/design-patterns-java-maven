package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/13/2021 4:43 PM
*/

import java.util.Scanner;

public class Client {
    private DispenseChain dispenseChainOne;

    public Client() {
        // initialize the chain
        this.dispenseChainOne = new Dollar50Dispenser();
        DispenseChain dispenseChainTwo = new Dollar20Dispenser();
        DispenseChain dispenseChainThree = new Dollar10Dispenser();

        // set the chain of responsibility
        dispenseChainOne.setNextChain(dispenseChainTwo);
        dispenseChainTwo.setNextChain(dispenseChainThree);
    }

    public static void main(String[] args) {
        Client atmDispensor = new Client();

        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense ?");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if(amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }

            // process the request
            atmDispensor.dispenseChainOne.dispense(new Currency(amount));
        }
    }
}
