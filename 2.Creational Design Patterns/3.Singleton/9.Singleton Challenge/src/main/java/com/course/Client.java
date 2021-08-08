package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/26/2021 5:18 PM
*/

import com.tools.ConsoleColors;

public class Client {
    public static void main(String[] args) {

        System.out.println(ConsoleColors.ANSI_CYAN + "### Singleton Pattern Demo ###\n");
        System.out.println(ConsoleColors.ANSI_YELLOW + "Trying to make a captain for our team\n");

        MakeCaptain captainOne = MakeCaptain.getCaptain();

        System.out.println(ConsoleColors.ANSI_YELLOW + "Trying to make another captain for our team\n");

        MakeCaptain captainTwo = MakeCaptain.getCaptain();

        if(captainOne == captainTwo) {
            System.out.println("captainOne and captainTwo are the same instance");
        }
    }
}
