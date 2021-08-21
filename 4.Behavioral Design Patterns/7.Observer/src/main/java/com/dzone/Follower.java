package com.dzone;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/21/2021 1:34 AM
*/

public class Follower implements Observer {
    private final String name;

    public Follower(String name) {
        super();
        this.name = name;
    }

    @Override
    public void notification(String handle, String tweet) {
        System.out.printf("'%s' received notification from Handle: '%s', Tweet: '%s'\n", name, handle, tweet);
    }
}
