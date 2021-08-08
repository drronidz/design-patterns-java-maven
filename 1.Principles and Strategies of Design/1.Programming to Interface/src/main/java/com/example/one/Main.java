package com.example.one;/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/17/2021 11:37 PM
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(" -------------------------- Programming to Interface (EXAMPLE TWO) --------------------------");
        // Coding for implementation & not for interface
//        com.example.one.Printer printer = new com.example.one.Printer();
//        printer.print("sedan");

        // Coding for interface & not for implementation
         Printer printer = new Printer(new TruckDB());
        System.out.println(" --------------------------------------------------------------------------------------------");

    }
}


