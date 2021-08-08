package com.baeldung;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/2/2021 12:02 AM
*/

import java.util.Arrays;

public class TextPrinter {
    TextManipulator textManipulator;

    public TextPrinter(TextManipulator textManipulator) {
        this.textManipulator = textManipulator;
    }

    public void printText() {
        System.out.println(textManipulator.getText());
    }
    public void printOutEachWordOfText() {
        System.out.println(Arrays.toString(textManipulator.getText().split(" ")));
    }
    public void printRangeOfCharacters(int startingIndex, int endingIndex) {
        System.out.println(textManipulator.getText().substring(startingIndex, endingIndex));
    }
}
