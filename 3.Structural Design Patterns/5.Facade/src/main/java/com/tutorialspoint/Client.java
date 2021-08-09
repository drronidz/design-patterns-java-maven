package com.tutorialspoint;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/8/2021 12:08 AM
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        int choice;
        do {
            System.out.println(" --------------------- Draw Shape --------------------- ");
            System.out.println(" 1. Circle \n");
            System.out.println(" 2. Rectangle \n");
            System.out.println(" 3. Square \n");
            System.out.println(" 4. EXIT \n");

            System.out.println("ENTER YOUR CHOICE: ");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(bufferedReader.readLine());
            ShapeMaker shapeMaker = new ShapeMaker();

            switch (choice) {
                case 1 -> shapeMaker.drawCircle();
                case 2 -> shapeMaker.drawRectangle();
                case 3 -> shapeMaker.drawSquare();
                default -> System.out.println("Nothing you drew");
            }

        }
        while (choice !=4);
    }
}
