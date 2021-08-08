package com.javaguides;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/1/2021 11:48 PM
*/

public // com.example.one.PrinterController class is the delegator
// The com.example.one.Printer controller use the com.example.one.Printer Interface
class PrinterController implements Printer {
    private final Printer printer;

    public PrinterController(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String message) {
        printer.print(message);
    }
}
