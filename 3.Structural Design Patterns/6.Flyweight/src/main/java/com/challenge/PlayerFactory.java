package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 12:26 AM
*/

import java.util.HashMap;

public class PlayerFactory {
    private static HashMap<String, Player> playersTypes = new HashMap<>();

    public static Player getPlayer(String type) {
        Player player = null;

        if(playersTypes.containsKey(type)) {
            player = playersTypes.get(type);
        } else {
            switch (type) {
                case "Terrorist" :
                    System.out.println("Terrorist Created");
                    player = new Terrorist();
                    break;
                case "CounterTerrorist" :
                    System.out.println("Counter Terrorist Created");
                    player = new CounterTerrorist();
                    break;
                default:
                    System.out.println("We have only two type of Players!!");
            }
            playersTypes.put(type, player);
        }
        return player;
    }
}
