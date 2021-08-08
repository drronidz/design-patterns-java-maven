package com.one;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/29/2021 12:12 AM
*/


import com.tools.ConsoleColors;
import com.course.Singleton;

import java.lang.reflect.Constructor;

public class Reflection {
    // Reflection can be used to destroy all the above singleton implementation approaches.
    // Let's see this with an com.example class:
    public static void main(String[] args) {
        Singleton instanceOne = Singleton.getInstance();
        Singleton intanceThree = Singleton.getInstance();
        Singleton instanceTwo = null;
        try {
            Constructor[] constructors = Singleton.class.getDeclaredConstructors();

            for (Constructor constructor : constructors) {
                // The code below will destroy the singleton pattern:
                constructor.setAccessible(true);
                instanceTwo = (Singleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(ConsoleColors.ANSI_PURPLE + "instance one has code   is   :" + instanceOne.hashCode());
        System.out.println(ConsoleColors.ANSI_GREEN + "instance two has code   is   :" + instanceTwo.hashCode());
        System.out.println(ConsoleColors.ANSI_PURPLE + "instance three has code is   :" + intanceThree.hashCode());
    }
}
