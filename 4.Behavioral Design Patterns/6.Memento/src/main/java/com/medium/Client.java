package com.medium;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/19/2021 11:46 PM
*/

public class Client {
    public static void main(String[] args) {
        RankHistory rankHistory = new RankHistory();

        Player player_1 = new Player();

        System.out.println("\n------------ Test cases to check adding ------------");
        //Test cases to check adding
        player_1.addRank(new Rank(82, HealthState.HEALTHY));
        player_1.addRank(new Rank(90, HealthState.UNHEALTHY));

        // saving current state
        rankHistory.saveRank(player_1);

        System.out.println(player_1);

        player_1.addRank(new Rank(50, HealthState.UNHEALTHY));

        rankHistory.saveRank(player_1);
        System.out.println(player_1);

        player_1.addRank(new Rank(55, HealthState.UNHEALTHY));

        rankHistory.saveRank(player_1);
        System.out.println(player_1);

        // Test cases to check removing (reverting)
        System.out.println("\n------------ Test cases to check removing ------------");
        rankHistory.revertRank(player_1);
        System.out.println(player_1);

        rankHistory.revertRank(player_1);
        System.out.println(player_1);

        rankHistory.revertRank(player_1);
        System.out.println(player_1);

        rankHistory.revertRank(player_1);
        System.out.println(player_1);
    }
}
