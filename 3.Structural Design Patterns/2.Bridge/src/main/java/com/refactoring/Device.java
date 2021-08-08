package com.refactoring;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/5/2021 12:02 AM
*/

public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int percent);
    int getChannel();
    void setChannel(int channel);
    void printStatus();
}
