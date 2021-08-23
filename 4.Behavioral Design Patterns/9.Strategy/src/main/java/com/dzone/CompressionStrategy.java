package com.dzone;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/23/2021 2:32 AM
*/

import java.io.File;
import java.util.List;

public interface CompressionStrategy {
    void compressFiles(List<File> files);
}

class ZIPCompressionStrategy implements CompressionStrategy {

    @Override
    public void compressFiles(List<File> files) {
        // Using ZIP approach ...
        System.out.println("Using ZIP approach ...");
    }
}

class RARCompressionStrategy implements CompressionStrategy {

    @Override
    public void compressFiles(List<File> files) {
        // Using RAR approach ...
        System.out.println("Using RAR approach ...");
    }
}
