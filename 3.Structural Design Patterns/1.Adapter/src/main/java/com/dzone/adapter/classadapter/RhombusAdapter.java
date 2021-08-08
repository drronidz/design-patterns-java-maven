package com.dzone.adapter.classadapter;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/4/2021 1:14 AM
*/


import com.dzone.Rhombus;
import com.dzone.Shape;

public class RhombusAdapter extends Rhombus implements Shape {

    public RhombusAdapter() {
        super();
    }

    @Override
    public void draw() {
        this.drawShape();
    }

    @Override
    public void resize() {
        System.out.println("Rhombus can't be resized. Please create new one with required values.");
    }

    @Override
    public String description() {
        return "Rhombus object";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
