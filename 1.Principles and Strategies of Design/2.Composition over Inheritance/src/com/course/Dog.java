package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/1/2021 5:53 PM
*/

public class Dog extends Animal {
    private Runnable runnable;
    public Dog(int speed, Runnable runnable) {
        super("Wuff", speed);
        this.runnable = runnable;
    }

    @Override
    public void run() {
        this.runnable.run(speed);
    }
}
