package com.medium;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/20/2021 12:10 AM
*/

import java.util.ArrayList;

public class RankMemento {
    ArrayList<Rank> ranks;

    public RankMemento(ArrayList<Rank> players) {
        this.ranks = players;
    }

    public ArrayList<Rank> getRankList() {
        return ranks;
    }
}
