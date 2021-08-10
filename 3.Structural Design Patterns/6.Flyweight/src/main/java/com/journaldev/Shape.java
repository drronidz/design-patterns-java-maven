package com.journaldev;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 3:14 PM
*/

import java.awt.*;

public interface Shape {
    public void draw(Graphics graphics,
                     int x, int y,
                     int width,
                     int height,
                     Color color);
}
