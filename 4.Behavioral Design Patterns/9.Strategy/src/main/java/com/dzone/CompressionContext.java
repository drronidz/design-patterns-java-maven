package com.dzone;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/23/2021 2:34 AM
*/

import java.io.File;
import java.util.List;

public class CompressionContext {
    private CompressionStrategy strategy;

    // This can be set at runtime by the application preferences
    public void setCompressionStrategy(CompressionStrategy strategy) {
        // We can setup the default strategy here ...
        this.strategy = strategy;
    }


    // Use the strategy
    public void createArchive(List<File> files) {
        strategy.compressFiles(files);
    }
}
