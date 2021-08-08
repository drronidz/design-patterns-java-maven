package com.challenge.item;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/28/2021 4:08 PM
*/

import com.challenge.packing.Packing;

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
