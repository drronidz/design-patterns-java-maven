package com.javaguides;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/1/2021 11:47 PM
*/

import java.util.logging.Logger;

public // The Delegate classes implement the com.example.one.Printer Interface
// Delegate class
class EpsonPrinter implements Printer {
    private static final Logger LOGGER  = Logger.getLogger(String.valueOf(EpsonPrinter.class));

    @Override
    public void print(String message) {
        LOGGER.info("Epson com.example.one.Printer : {" + message + "}");
    }
}
