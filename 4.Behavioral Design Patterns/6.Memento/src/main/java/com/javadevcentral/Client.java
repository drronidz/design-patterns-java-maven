package com.javadevcentral;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/20/2021 1:02 AM
*/

public class Client {
    public static void main(String[] args) {
        EditorData editorData = new EditorData("You are learning Memento pattern", Color.PURPLE);

        Editor editor = new Editor(editorData);

        // 1. Change text
        editor.changeText("You are learning Memento pattern on Java Developer Central");

        // 2. Change color
        editor.changeColor(Color.GREEN);

        // 3. Change color
        editor.changeColor(Color.YELLOW);

        editor.printEditorContent();

        editor.undo();
        editor.printEditorContent();

        editor.undo();
        editor.printEditorContent();

        editor.undo();
        editor.printEditorContent();

        editor.undo();
        editor.printEditorContent();
    }
}
