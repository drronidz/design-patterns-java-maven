package com.challenge.item.drink;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/28/2021 4:12 PM
*/

import com.challenge.item.Item;
import com.challenge.packing.Bottle;
import com.challenge.packing.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
