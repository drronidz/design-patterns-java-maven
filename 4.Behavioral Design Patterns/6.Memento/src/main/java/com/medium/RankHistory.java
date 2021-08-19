package com.medium;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/20/2021 12:13 AM
*/

import java.util.Stack;

public class RankHistory {
    private final Stack<RankMemento> rankHistory = new Stack<>();

    public void saveRank(Player player) {
        rankHistory.push(player.saveRank());
    }

    public void revertRank(Player player) {
        if(!rankHistory.empty()) {
            player.revertRank(rankHistory.pop());
        } else {
            System.out.println("Nothing left to Undo");
        }
    }
}
