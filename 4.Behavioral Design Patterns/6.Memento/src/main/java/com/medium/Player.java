package com.medium;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/20/2021 12:07 AM
*/


import java.util.ArrayList;

// Originator class
public class Player {
    private ArrayList<Rank> rankList = new ArrayList<>();


    public void addRank(Rank rank) {
        rankList.add(rank);
    }

    public ArrayList<Rank> getRankList() {
        //Used clone method to prevent the referring to original ArrayList
        return (ArrayList<Rank>) rankList.clone();
    }

    // Returning current state to the careTaker (RankHistory)
    public RankMemento saveRank() {
        return new RankMemento(getRankList());
    }

    public void revertRank(RankMemento rankMemento) {
        rankList = rankMemento.getRankList();
    }

    @Override
    public String toString() {
        return "Player {"+ rankList +
                "}";
    }
}
