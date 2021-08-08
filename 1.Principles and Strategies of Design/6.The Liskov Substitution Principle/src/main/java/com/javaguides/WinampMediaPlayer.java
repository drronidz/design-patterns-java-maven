package com.javaguides;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/19/2021 5:12 PM
*/

public class WinampMediaPlayer extends AudioMediaPlayer {
    // Play video is not supported in WINAMP Player
    public void playVideo() {
        throw new VideoUnsupportedException();
    }
}
