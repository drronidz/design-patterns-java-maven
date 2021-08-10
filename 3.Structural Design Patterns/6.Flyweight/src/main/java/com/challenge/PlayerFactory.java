package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 12:26 AM
*/

import java.util.HashMap;

public class PlayerFactory {
    private static final HashMap<String, Player> playersCache = new HashMap<>();

    public static Player getPlayer(String type) {
        Player player = null;

        if(playersCache.containsKey(type)) {
            player = playersCache.get(type);
        } else {
            switch (type) {
                case "Terrorist" -> {
                    System.out.println("Terrorist Created");
                    player = new Terrorist();
                }
                case "CounterTerrorist" -> {
                    System.out.println("Counter Terrorist Created");
                    player = new CounterTerrorist();
                }
                default -> System.out.println("We have only two type of Players!!");
            }
            playersCache.put(type, player);
        }
        return player;
    }
}
