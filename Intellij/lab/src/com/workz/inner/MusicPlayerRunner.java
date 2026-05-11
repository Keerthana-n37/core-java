package com.workz.inner;

public class MusicPlayerRunner {

    public static void main(String[] args) {

        MusicPlayer musicPlayer=new SpotifyPlayer();
        musicPlayer.nextSong();
        musicPlayer.previousSong();
        musicPlayer.pause();
        musicPlayer.play();
        MusicPlayer.playlist();
    }
}
