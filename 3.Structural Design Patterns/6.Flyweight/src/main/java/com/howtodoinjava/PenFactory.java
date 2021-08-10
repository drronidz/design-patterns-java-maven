package com.howtodoinjava;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 2:44 AM
*/

import java.util.HashMap;

public class PenFactory {
    private static final HashMap <String, Pen> penCache = new HashMap<>();

    public static Pen createPen(String color, BrushSize brushSize) {
        Pen pen = null;
        String key = color + brushSize ;

        if(penCache.containsKey(key)) {
            pen = penCache.get(key);
        } else {
            switch (brushSize) {
                case THIN -> {
                    System.out.println("THIN pen created !");
                    pen = new ThinPen();
                    pen.setColor(color);
                }
                case THICK -> {
                    System.out.println("THICK pen created !");
                    pen = new ThickPen();
                    pen.setColor(color);
                }
                case MEDIUM -> {
                    System.out.println("MEDIUM pen created !");
                    pen = new MediumPen();
                    pen.setColor(color);
                }
            }
            penCache.put(key, pen);
        }
        return pen;

    }
}
