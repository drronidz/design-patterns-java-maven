package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/14/2021 12:34 AM
*/

public class FaxErrorHandler implements ReceiverInterface {
    private ReceiverInterface nextReceiver;

    @Override
    public void setNextChain(ReceiverInterface nextReceiver) {
        this.nextReceiver = nextReceiver;
    }

    @Override
    public boolean processMessage(Message message) {
        if(message.text.contains("Fax")) {
            System.out.println(
                    "FaxErrorHandler processed " + message.messagePriority +
                            " priority issue: " + message.text);
            return true;
        } else {
            if(nextReceiver != null) {
                nextReceiver.processMessage(message);
            }
        }
        return false;
    }
}
