package com.javadesignpatterns;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/19/2021 1:42 AM
*/

import java.util.ArrayList;
import java.util.List;

public class PartyImpl implements Party{
    private final List<PartyMember> members;

    public PartyImpl() {
        this.members = new ArrayList<>();
    }

    @Override
    public void addMember(PartyMember member) {
        members.add(member);
        member.joinedParty(this);
    }

    @Override
    public void act(PartyMember actor, Action action) {
        for(var member : members) {
            if(!member.equals(actor)) {
                member.partyAction(action);
            }
        }
    }
}
