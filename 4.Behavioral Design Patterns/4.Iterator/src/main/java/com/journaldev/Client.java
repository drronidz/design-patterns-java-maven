package com.journaldev;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/18/2021 12:51 AM
*/

public class Client {
    public static void main(String[] args) {
        ChannelCollection channels = populateChannels();

        ChannelIterator baseIterator = channels.iterator(ChannelType.ALL);
        while (baseIterator.hasNext()) {
            Channel channel = baseIterator.next();
            System.out.println(channel.toString());
        }
        System.out.println("----------------");
        // Channel Type Iterator
        ChannelIterator englishIterator = channels.iterator(ChannelType.ENGLISH);
        while (englishIterator.hasNext()) {
            Channel channel = englishIterator.next();
            System.out.println(channel.toString());
        }
    }

    private static ChannelCollection populateChannels() {

        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5,  ChannelType.ENGLISH));
        channels.addChannel(new Channel(99.5,  ChannelType.ARABIC));
        channels.addChannel(new Channel(100.5, ChannelType.FRENCH));
        channels.addChannel(new Channel(101.5, ChannelType.ENGLISH));
        channels.addChannel(new Channel(102.5, ChannelType.ARABIC));
        channels.addChannel(new Channel(103.5, ChannelType.FRENCH));
        channels.addChannel(new Channel(104.5, ChannelType.ENGLISH));
        channels.addChannel(new Channel(105.5, ChannelType.HINDI));
        channels.addChannel(new Channel(106.5, ChannelType.ARABIC));
        return channels;
    }
}
