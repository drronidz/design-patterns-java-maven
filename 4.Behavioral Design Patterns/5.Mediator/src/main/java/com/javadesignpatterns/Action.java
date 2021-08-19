package com.javadesignpatterns;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/19/2021 1:27 AM
*/

public enum  Action {
    HUNT ("hunted a rabbit", "arrives for dinner"),
    TALE ("tells a tale", "comes to listen"),
    GOLD ("found gold","takes his share of the gold"),
    ENEMY ("spotted enemies", "runs for cover"),
    NONE ("","");

    private final String title;
    private final String description;

    Action(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Object getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return title;
    }
}
