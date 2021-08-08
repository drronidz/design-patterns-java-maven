package com.course.three;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/3/2021 12:16 AM
*/



public class Client {
    public static void main(String[] args) {

        System.out.println("#####-- Class & Object Adapter Example --#####");
        ClassAdapter classAdapterOne = new ClassAdapter();
        System.out.println("Class Adapter is returning : " +classAdapterOne.getInteger());

        ObjectAdapter objectAdapterOne = new ObjectAdapter(new IntegerValue());
        System.out.println("Object Adapter is returning : " +objectAdapterOne.getInteger());
    }
}
