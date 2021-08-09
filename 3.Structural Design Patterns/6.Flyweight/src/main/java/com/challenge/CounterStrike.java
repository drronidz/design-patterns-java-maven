package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 12:32 AM
*/

import java.util.Random;

public class CounterStrike {
    // All player types and weapons (used by getRandomPlayerType()
    // and getRandomWeapon()

    // Utility methods to get a random player type and weapon


    private static final String [] playerType = {"Terrorist", "CounterTerrorist"};

    private static final String [] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

    public static String getRandomPlayerType() {
        Random random = new Random();

        // Will return an integer between [0,2]
        int randomInteger = random.nextInt(playerType.length);

        // return the player stored at index 'randomInteger'
        return playerType[randomInteger];
    }

    public static String getRandomWeapon() {
        Random random = new Random();

        // Will return an integer between [0,5]
        int randomInteger = random.nextInt(weapons.length);

        // Return the weapon stored at index 'randomInteger'
        return weapons[randomInteger];
    }

    public static void main(String[] args) {
        /* Assume that we have a total of 10 players in the game.*/
        for (int i = 0; i < 10 ; i++) {
            /* getPlayer() is called simply using the class name since the method is a static one*/
            Player player = PlayerFactory.getPlayer(getRandomPlayerType());

            /* Assign a weapon chosen randomly uniformly from the weapon array*/
            player.assignWeapon(getRandomWeapon());

            // Send this player on a mission
            player.mission();
        }

    }
}
