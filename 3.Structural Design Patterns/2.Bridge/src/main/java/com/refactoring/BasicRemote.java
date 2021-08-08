package com.refactoring;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/5/2021 12:13 AM
*/



public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote() {
    }

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Remote: power toggle");
        if(device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeDOWN() {
        System.out.println("Remote: Volume DOWN");
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUP() {
        System.out.println("Remote: Volume UP");
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void channelDOWN() {
        System.out.println("Remote: channel DOWN");
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void channelUP() {
        System.out.println("Remote: channel UP");
        device.setChannel(device.getChannel() + 1);
    }
}
