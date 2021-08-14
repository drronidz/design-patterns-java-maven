package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/14/2021 12:31 AM
*/

public class Message {
    public String text;
    public MessagePriority messagePriority;

    public Message(String text, MessagePriority messagePriority) {
        this.text = text;
        this.messagePriority = messagePriority;
    }
}
