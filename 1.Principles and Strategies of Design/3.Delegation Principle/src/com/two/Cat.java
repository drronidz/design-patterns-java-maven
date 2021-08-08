package com.two;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/1/2021 11:50 PM
*/

// Delegator class
public class Cat {
    private ISoundBehaviour sound = new MeowSound();

    public void makeSound() {
        this.sound.makeSound();
    }

    public void setSoundBehaviour(ISoundBehaviour newSound) {
        this.sound = newSound;
    }
}
