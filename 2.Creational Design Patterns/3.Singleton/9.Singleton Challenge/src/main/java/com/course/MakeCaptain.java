package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/27/2021 2:19 PM
*/

public class MakeCaptain {
    private MakeCaptain() {}

    // Bill Pugh Solution

    private static class SingletonHelper {
        // nested class is referenced after getCaptain() is called
        private static final MakeCaptain _captain = new MakeCaptain();
    }

    public static MakeCaptain getCaptain() {
        return SingletonHelper._captain;
    }
}
