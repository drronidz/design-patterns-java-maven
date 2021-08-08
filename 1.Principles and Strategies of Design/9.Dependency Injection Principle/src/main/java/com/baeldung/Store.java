package com.baeldung;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/20/2021 7:07 PM
*/

public class Store {
    private Item item;

    // Create an object dependency in traditional programming
    public Store() {
        item = new ItemOne();
    }

    // Create an object dependency in modern programming (DI)
    public Store(Item item) {
        this.item = item;
    }
}
