package com.workz.inner;

public interface MusicPlayer {

    String app="Spotify";
    int songs=1000;
    boolean premium=true;

    void play();
    void pause();

    default void nextSong()
    {
        System.out.println("Executing nextSong in MusicPlayer");
    }

    default void previousSong()
    {
        System.out.println("Executing previousSong in MusicPlayer");
    }

    static void playlist()
    {
        System.out.println("Executing playlist in MusicPlayer");
    }
}
