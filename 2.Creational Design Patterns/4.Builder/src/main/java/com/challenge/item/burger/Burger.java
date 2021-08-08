package com.challenge.item.burger;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/28/2021 4:09 PM
*/

import com.challenge.item.Item;
import com.challenge.packing.Packing;
import com.challenge.packing.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
