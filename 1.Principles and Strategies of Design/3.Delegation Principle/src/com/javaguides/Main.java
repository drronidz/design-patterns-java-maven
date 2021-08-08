package com.javaguides;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/1/2021 11:46 PM
*/

 // Delegation test using com.example.one.Main class ( via main method)
public class Main {
    public static final String MESSAGE_TO_PRINT = "hello world";
    public static void main(String[] args) {

        PrinterController hpPrinterController = new PrinterController(new HPPrinter());
        PrinterController canonPrinterController = new PrinterController(new CanonPrinter());
        PrinterController epsonPrinterController = new PrinterController(new EpsonPrinter());

        hpPrinterController.print(MESSAGE_TO_PRINT);
        canonPrinterController.print(MESSAGE_TO_PRINT);
        epsonPrinterController.print(MESSAGE_TO_PRINT);
    }
}
