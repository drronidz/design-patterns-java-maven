package com.journaldev;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/18/2021 12:43 AM
*/

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {
    private final List<Channel> channels;

    public ChannelCollectionImpl() {
        this.channels = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel channel) {
        this.channels.add(channel);
    }

    @Override
    public void removeChannel(Channel channel) {
        this.channels.remove(channel);
    }

    @Override
    public ChannelIterator iterator(ChannelType type) {
        return new ChannelIteratorImpl(type, this.channels);
    }

    private static class ChannelIteratorImpl implements ChannelIterator {
        private final ChannelType type;
        private final List<Channel> channels;
        private int position;

        public ChannelIteratorImpl(ChannelType type, List<Channel> channels) {
            this.type = type;
            this.channels = channels;
        }

        @Override
        public boolean hasNext() {
            while (position < channels.size()) {
                Channel channel = channels.get(position);

                if(channel.getType().equals(type) || type.equals(ChannelType.ALL)) {
                    return true;
                }
                else {
                    position++;
                }
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel channel = channels.get(position);
            position++;
            return channel;
        }
    }
}
