package com.howtodoinjava.client;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/15/2021 1:46 AM
*/

import com.howtodoinjava.command.StartFanCommand;
import com.howtodoinjava.command.StopFanCommand;
import com.howtodoinjava.command.TurnOnLightCommand;
import com.howtodoinjava.invoker.HomeAutomationRemote;
import com.howtodoinjava.receiver.Fan;
import com.howtodoinjava.receiver.Light;

public class Client {
    public static void main(String[] args) {
        Light livingRoomLight = new Light(); // receiver 1

        Fan livingRoomFan = new Fan(); // receiver 2

        Light bedRoomLight = new Light(); // receiver 3

        Fan bedRoomFan = new Fan(); // receiver 4

        HomeAutomationRemote remote = new HomeAutomationRemote(); // Invoker

        remote.setCommand(new TurnOnLightCommand(livingRoomLight));
        remote.buttonPressed();

        remote.setCommand(new TurnOnLightCommand(bedRoomLight));
        remote.buttonPressed();

        remote.setCommand(new StartFanCommand(livingRoomFan));
        remote.buttonPressed();

        remote.setCommand(new StartFanCommand(bedRoomFan));
        remote.buttonPressed();

        remote.setCommand(new StopFanCommand(livingRoomFan));
        remote.buttonPressed();

        remote.setCommand(new StopFanCommand(bedRoomFan));
        remote.buttonPressed();



    }
}
