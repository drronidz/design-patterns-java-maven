package com.javadesignpatterns;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/19/2021 1:28 AM
*/

public abstract class PartyMemberBase implements PartyMember {

    protected Party party;

    @Override
    public void joinedParty(Party party) {
        System.out.println(this + " joins the party");
        this.party = party;
    }

    @Override
    public void partyAction(Action action) {
        System.out.println(this + " : " +action.getDescription());
    }

    @Override
    public void act(Action action) {
        if(party != null) {
            System.out.println(this + " " + action);
            party.act(this,action);
        }
    }

    @Override
    public abstract String toString();
}
