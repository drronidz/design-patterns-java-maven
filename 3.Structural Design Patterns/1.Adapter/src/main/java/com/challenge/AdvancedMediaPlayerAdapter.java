package com.challenge;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/3/2021 12:40 AM
*/



public class AdvancedMediaPlayerAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMusicPlayer) {
        this.advancedMusicPlayer = advancedMusicPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        advancedMusicPlayer.loadFileName(fileName);
        advancedMusicPlayer.listen();
    }
}
