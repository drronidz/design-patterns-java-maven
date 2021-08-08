package com.medium;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/5/2021 11:58 PM
*/

public class Client {
    public static void main(String[] args) {
        Human mathys = new Child("Mathys" , "Le Tutour");
        Human erwan = new Child("Erwan" , "Le Tutour");
        Human amelie = new Child("Amelie" , "Le Tutour");

        mathys.addParent(erwan);
        mathys.addParent(amelie);

        erwan.addChild(mathys);
        amelie.addChild(mathys);

        Human philippe = new GrandParent("Philippe" , "Le Tutour");

        philippe.addParent(erwan);
        erwan.addParent(philippe);

        philippe.print();
        erwan.print();
        mathys.print();

    }
}
