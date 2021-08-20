package com.javadevcentral;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/20/2021 12:58 AM
*/

import java.util.Stack;

public class Editor {
    private final EditorData editorData;
    private final Stack<Snapshot> snapshots;

    public Editor(EditorData editorData) {
        this.editorData = editorData;
        this.snapshots = new Stack<>();
    }

    public void changeText(String newText) {
        // Create and store current state
        snapshots.push(editorData.createSnapshot());
        editorData.setText(newText);
    }

    public void changeColor(Color newColor) {
        // Create and store current state
        snapshots.push(editorData.createSnapshot());
        editorData.setColor(newColor);
    }

    public void undo() {
        if(snapshots.isEmpty()) {
            System.out.println("Already back to original state");
        } else {
            editorData.restoreFromSnapshot(snapshots.pop());
        }
    }

    // For debugging
    public void printEditorContent() {
        editorData.print();
    }
}
