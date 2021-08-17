package com.journaldev;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/18/2021 12:41 AM
*/

public interface ChannelCollection {
    public void addChannel(Channel channel);
    public void removeChannel(Channel channel);
    public ChannelIterator iterator(ChannelType type);
}
