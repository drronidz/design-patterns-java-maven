package com.javadesignpatterns;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/19/2021 1:48 AM
*/

public class Client {
    public static void main(String[] args) {
        Party party = new PartyImpl();

        var hobbit = new Hobbit();
        var wizard = new Wizard();
        var rogue = new Rogue();
        var hunter = new Hunter();

        // add party members

        party.addMember(hobbit);
        party.addMember(wizard);
        party.addMember(rogue);
        party.addMember(hunter);

        /*
        * perform actions -> The other party members
        * are notified by the party
        * */

        hobbit.act(Action.ENEMY);
        wizard.act(Action.TALE);
        rogue.act(Action.GOLD);
        hunter.act(Action.HUNT);


    }
}
