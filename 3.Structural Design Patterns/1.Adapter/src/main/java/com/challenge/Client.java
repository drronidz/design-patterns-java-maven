package com.challenge;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/3/2021 12:30 AM
*/

import com.tools.MP4Player;
import com.tools.MediaPlayer;
import com.tools.VLCPlayer;

public class Client {
    public static void main(String[] args) {
        System.out.println("####### Adapter Challenge #######");

        System.out.println("Playing MP3 file ...");
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "jasonsMusic.mp3");

        System.out.println("Playing MP4 file ...");
        AdvancedMediaPlayer mp4Player = new MP4Player();
        MediaPlayer advancedMediaPlayerAdapterOne = new AdvancedMediaPlayerAdapter(mp4Player);
        advancedMediaPlayerAdapterOne.play("mp4", "alone.mp4");

        System.out.println("Playing VLC file ...");
        AdvancedMediaPlayer vlcPlayer = new VLCPlayer();
        MediaPlayer advancedMediaPlayerAdapterTwo = new AdvancedMediaPlayerAdapter(vlcPlayer);
        advancedMediaPlayerAdapterTwo.play("vlc", "far far away.vlc");


        audioPlayer.play("vlc", "far far away.vlc");
    }
}
