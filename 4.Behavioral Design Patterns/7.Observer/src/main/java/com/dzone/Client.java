package com.dzone;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/21/2021 1:36 AM
*/

public class Client {
    public static void main(String[] args) {
        Celebrity baiden = new Celebrity("Joe Baiden", "baiden");
        Celebrity trodo = new Celebrity("Justin Trodo", "trodo");

        Follower jason = new Follower("Jason");
        Follower john = new Follower("John");
        Follower abdou = new Follower("Abdou");
        Follower anna = new Follower("Anna");
        Follower kim = new Follower("Kim");

        baiden.addSubscriber(jason);
        baiden.addSubscriber(abdou);
        baiden.addSubscriber(john);

        trodo.addSubscriber(abdou);
        trodo.addSubscriber(anna);
        trodo.addSubscriber(kim);

        baiden.tweet("We need peace in Afghanistan !");
        trodo.tweet("Canada need more brains more software engineering people !!!");

        trodo.removeSubscriber(kim);

        trodo.tweet("Muslims are very important in our society !!");

    }
}
