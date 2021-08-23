package com.dzone;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/23/2021 2:36 AM
*/

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Client {


    public static void main(String[] args) {
        List<File> files = new ArrayList<>();


        CompressionContext context = new CompressionContext();
        // We could assume context is already set by preferences
        context.setCompressionStrategy(new ZIPCompressionStrategy());

        // get a list of files

        context.createArchive(files);
    }
}
