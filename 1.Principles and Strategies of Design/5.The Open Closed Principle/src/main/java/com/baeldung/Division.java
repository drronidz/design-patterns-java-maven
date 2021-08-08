package com.baeldung;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/21/2021 1:11 AM
*/

import com.tools.ConsoleColors;

public class Division implements CalculatorOperation {

    private double left;
    private double right;
    private double result;

    public Division(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void perform() {
        if(right != 0) {
            result = left / right;
        }
    }
    // Getters & Setters
    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return ConsoleColors.ANSI_PURPLE + " Division { " + left + " / " + right + " = " + result + " }";
    }
}
