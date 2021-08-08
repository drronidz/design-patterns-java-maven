package com.journaldev;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/3/2021 5:06 PM
*/



// Using inheritance for Adapter Pattern
public class SocketClassAdapter extends Socket implements SocketAdapter {
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt = getVolt();
        return convertVolt(volt, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt volt = getVolt();
        return convertVolt(volt, 40);
    }

    private Volt convertVolt(Volt volt, int i) {
        return new Volt(volt.getVolts()/i);
    }
}
