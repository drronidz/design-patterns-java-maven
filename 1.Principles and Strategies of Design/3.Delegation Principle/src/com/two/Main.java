package com.two;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/1/2021 11:50 PM
*/

 public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();

        // Delegation
        cat.makeSound();  // output : Meow Meow ...

        // Now to change the sound it makes
        ISoundBehaviour newSound = new RoarSound();
        cat.setSoundBehaviour(newSound);

        // Delegation
        cat.makeSound();

    }
}
