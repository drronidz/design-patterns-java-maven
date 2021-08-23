package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/23/2021 2:14 AM
*/

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(); // the Context

        Item item_1 = new Item("1234", 10);
        Item item_2 = new Item("5678", 40);

        cart.addItem(item_1);
        cart.addItem(item_2);


        // pay by paypal
        cart.pay(new PaypalStrategy("halim.du19@gmail.com","mypassword"));

        // pay by credit card
        cart.pay(new CreditCardStrategy("John Smogla","8899887711","4587","12/04/2024"));

    }
}
