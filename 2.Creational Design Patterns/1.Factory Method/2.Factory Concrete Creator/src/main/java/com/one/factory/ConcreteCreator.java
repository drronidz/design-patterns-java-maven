package com.one.factory;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/22/2021 11:20 PM
*/

import com.one.product.ConcreteProductOne;
import com.one.product.ConcreteProductTwo;
import com.one.product.Product;

public class ConcreteCreator  implements Creator<Product> {
    @Override
    public Product create(String productClass) {
        return switch (productClass) {
            case "ConcreteProductOne" -> new ConcreteProductOne();
            case "ConcreteProductTwo" -> new ConcreteProductTwo();
            default -> null;
        };
    }
}
