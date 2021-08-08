package com.journaldev;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/3/2021 5:11 PM
*/



public class SocketObjectAdapter implements SocketAdapter{

    // Using Composition for Adapter Pattern
    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt = socket.getVolt();
        return convertVolt(volt, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt volt = socket.getVolt();
        return convertVolt(volt, 40);
    }

    private Volt convertVolt(Volt volt, int i) {
        return new Volt(volt.getVolts()/i);
    }
}
