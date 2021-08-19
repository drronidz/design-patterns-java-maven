package com.javadesignpatterns;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/19/2021 1:27 AM
*/

public interface Party {
    public void addMember(PartyMember member);
    public void act(PartyMember partyMemberBase, Action action);
}
