package com.baeldung;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/2/2021 12:02 AM
*/

public class TextManipulator {
    private String text;

    public TextManipulator (String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
    public void appendText(String newText) {
        text = text.concat(newText);
    }
    public String findWordAndReplace(String word, String replacementWord) {
        if(text.contains(word)) {
            text = text.replace(word, replacementWord);
        }
        return text;
    }
    public String findWordAndDelete(String word) {
        if(text.contains(word)) {
            text = text.replace(word, "");
        }
        return text;
    }
}
