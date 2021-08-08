package com.course;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/21/2021 1:54 AM
*/

import com.tools.ConsoleColors;


public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Bus();
        System.out.println(ConsoleColors.ANSI_CYAN + vehicle.getSpeed());
        System.out.println(ConsoleColors.ANSI_CYAN + vehicle.getCubicCapacity());

        vehicle = new Car();
        System.out.println(ConsoleColors.ANSI_GREEN + vehicle.getSpeed());
        System.out.println(ConsoleColors.ANSI_GREEN + vehicle.getCubicCapacity());
    }
}
