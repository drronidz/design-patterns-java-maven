package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/14/2021 12:31 AM
*/

public class Client {
    public static void main(String[] args) {
        System.out.println(" --------- Chain of Responsibility Pattern --------- ");

        // making the chain first: Fax -> email
        ReceiverInterface faxHandler, emailHandler;

        // end of chain
        emailHandler = new EmailErrorHandler();

        // fax handler is before email
        faxHandler = new FaxErrorHandler();
        faxHandler.setNextChain(emailHandler);

        // starting point: raiser will raise issues and set the first handler
        IssueRaiser issueRaiser = new IssueRaiser(faxHandler);

        Message messageOne = new Message("Fax is reaching late to the destination", MessagePriority.NORMAL);
        Message messageTwo = new Message("Email is not going", MessagePriority.HIGH);
        Message messageThree = new Message("In Email, BCC field s disabled occasionally ", MessagePriority.NORMAL);
        Message messageFour = new Message("Fax is not reaching destination", MessagePriority.HIGH);

        issueRaiser.raiseMessage(messageOne);
        issueRaiser.raiseMessage(messageTwo);
        issueRaiser.raiseMessage(messageThree);
        issueRaiser.raiseMessage(messageFour);

    }
}
