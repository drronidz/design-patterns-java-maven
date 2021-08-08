package com.course.two;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/2/2021 4:40 PM
*/



public class Client {
    public static void main(String[] args) {
        System.out.println("###### Adapter Pattern Demo ######");
        Triangle triangle = new Triangle(20, 10);
        CalculatorInterface calculatorAdapter = new CalculatorAdapter(triangle);

        System.out.println("Area of Triangle is : " + calculatorAdapter.getArea(null));
    }
}
