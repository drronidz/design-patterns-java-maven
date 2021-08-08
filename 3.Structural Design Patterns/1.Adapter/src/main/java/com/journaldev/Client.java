package com.journaldev;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/3/2021 5:26 PM
*/

import com.tools.*;

public class Client {
    public static void main(String[] args) {
        objectAdapterTest();
        classAdapterTest();
    }

    private static void objectAdapterTest() {
        SocketAdapter socketAdapter = new SocketObjectAdapter();
        Volt v3 = getVolt(socketAdapter,3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);

        System.out.println(ConsoleColors.ANSI_GREEN + "V003  Volts using Object Adapter = " + v3.getVolts());
        System.out.println(ConsoleColors.ANSI_GREEN + "V012  Volts using Object Adapter = " + v12.getVolts());
        System.out.println(ConsoleColors.ANSI_GREEN + "V120  Volts using Object Adapter = " + v120.getVolts());
    }
    private static void classAdapterTest() {
        SocketAdapter socketAdapter = new SocketClassAdapter();
        Volt v3 = getVolt(socketAdapter,3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);

        System.out.println(ConsoleColors.ANSI_PURPLE + "V003  Volts using Class Adapter = " + v3.getVolts());
        System.out.println(ConsoleColors.ANSI_PURPLE + "V012  Volts using Class Adapter = " + v12.getVolts());
        System.out.println(ConsoleColors.ANSI_PURPLE + "V120  Volts using Class Adapter = " + v120.getVolts());
    }
    private static Volt getVolt(SocketAdapter socketAdapter, int i) {
        return switch (i) {
            case 3 -> socketAdapter.get3Volt();
            case 12 -> socketAdapter.get12Volt();
            default -> socketAdapter.get120Volt();
        };
    }
}
