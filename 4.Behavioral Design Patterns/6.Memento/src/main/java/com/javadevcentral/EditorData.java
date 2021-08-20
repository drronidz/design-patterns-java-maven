package com.javadevcentral;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/20/2021 12:38 AM
*/


import com.tools.ConsoleColors;

public class EditorData {
    private String text;
    private Color color;

    public EditorData() {
    }

    public EditorData(String text, Color color) {
        this.text = text;
        this.color = color;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Snapshot createSnapshot() {
        return new Snapshot(text,color);
    }

    public void restoreFromSnapshot(Snapshot snapshot) {
        this.text = snapshot.getText();
        this.color = snapshot.getColor();
    }

    // For debugging
    public void print() {
        switch (color) {
            case GREEN -> {
                System.out.println(ConsoleColors.ANSI_GREEN + "TEXT : " + text);
                System.out.println(ConsoleColors.ANSI_GREEN + "Color :" + color);
            }
            case PURPLE -> {
                System.out.println(ConsoleColors.ANSI_PURPLE + "TEXT : " + text);
                System.out.println(ConsoleColors.ANSI_PURPLE + "Color :" + color);
            }
            case YELLOW -> {
                System.out.println(ConsoleColors.ANSI_YELLOW + "TEXT : " + text);
                System.out.println(ConsoleColors.ANSI_YELLOW + "Color :" + color);
            }
        }
        System.out.println("Color :" + color);
    }
}
