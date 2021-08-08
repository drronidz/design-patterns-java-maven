package com.one;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/22/2021 10:45 PM
*/

import com.one.factory.ConcreteCreator;
import com.one.factory.Creator;
import com.one.product.Product;

public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();

        Product productOne = (Product) creator.create("ConcreteProductOne");
        System.out.println(productOne.getName());

        Product productTwo = (Product) creator.create("ConcreteProductTwo");
        System.out.println(productTwo.getName());
    }
}
