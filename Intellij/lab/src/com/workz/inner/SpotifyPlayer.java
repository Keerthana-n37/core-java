package com.workz.inner;

public class SpotifyPlayer implements MusicPlayer{

    @Override
    public void play() {
        System.out.println("Executing play method in SpotifyPlayer");
    }

    @Override
    public void pause() {
        System.out.println("Executing pause in SpotifyPlayer");
    }
}
