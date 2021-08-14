package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/14/2021 12:34 AM
*/

public interface ReceiverInterface {
    boolean processMessage(Message message);
    void setNextChain(ReceiverInterface nextChain);
}
