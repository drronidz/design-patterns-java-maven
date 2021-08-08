package com.javaguides;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/19/2021 5:14 PM
*/



import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Created list of players
        List<VideoMediaPlayer> allPlayers = new ArrayList<>();
        allPlayers.add(new VLCMediaPlayer());

        // Play video in all Players
        playVideoInAllMediaPlayers(allPlayers);

        // Everything work as of now ....
        System.out.println("------------------------------------------------");

        // Now adding new WINAMP Player
        // allPlayers.add(new WinampMediaPlayer()); ( Cannot add audio player to video player list ).

        // Again play video in all players & Oops it broke the program...
        // Why we got unexpected behavior in client? ---
        // Because LSP is violated in WinampMediaPlayer.java
        // as it changed the original behavior of super class MediaPlayer.java

        playVideoInAllMediaPlayers(allPlayers);

    }

    public static void playVideoInAllMediaPlayers(List<VideoMediaPlayer> allPlayers) {
        for (VideoMediaPlayer mediaPlayer: allPlayers) {
            mediaPlayer.playVideo();
        }
    }
}
