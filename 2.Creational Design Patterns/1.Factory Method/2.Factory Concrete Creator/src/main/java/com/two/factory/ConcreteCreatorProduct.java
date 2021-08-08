package com.two.factory;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/23/2021 12:14 AM
*/

import com.two.product.ConcreteProductOne;
import com.two.product.ConcreteProductTwo;
import com.two.product.Product;

public class ConcreteCreatorProduct implements Creator<Product> {
    @Override
    public Product create(String type) {
        return switch (type) {
            case "ConcreteProductOne" -> new ConcreteProductOne();
            case "ConcreteProductTwo" -> new ConcreteProductTwo();
            default -> null;
        };
    }
}
