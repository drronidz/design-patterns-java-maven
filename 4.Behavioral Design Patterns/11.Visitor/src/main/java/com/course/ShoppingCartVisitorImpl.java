package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/24/2021 11:24 PM
*/

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor{

    @Override
    public int visit(Book book) {
        int cost;
        // apply 5$ discount if book price is greater than 50
        if(book.getPrice() >50) {
            cost = book.getPrice() - 5;
        } else {
            cost = book.getPrice();
        }
        System.out.println("Book ISBN ::" + book.getIsbnNumber() + " cost =" + cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        return fruit.getPricePerKG() * fruit.getWeight();
    }
}
