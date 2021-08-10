package com.journaldev;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 3:17 PM
*/

import java.awt.*;

public class Oval implements Shape{

    // intrinsic property
    private final boolean fill;

    public Oval(boolean fill) {
        this.fill = fill;

        System.out.println("Creating Oval object with fill = " + fill);

        // Adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics circle, int x, int y, int width, int height, Color color) {
        circle.setColor(color);
        circle.drawOval(x, y, width, height);
        if(fill) {
            circle.fillOval(x, y, width, height);
        }
    }
}
