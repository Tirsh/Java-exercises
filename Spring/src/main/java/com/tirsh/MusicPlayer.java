package com.tirsh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music classicMusic;
    private Music rapMusic;

    @Autowired
    public MusicPlayer(ClassicMusic classicMusic, RapMusic rapMusic) {
        this.classicMusic = classicMusic;
        this.rapMusic = rapMusic;
    }

    public void playMusic(MusicGenres genre){
        Random random = new Random();
        String song = "";
        if (genre == MusicGenres.CLASSIC){
            song = this.classicMusic.getSong().get(random.nextInt(3));

        }
        if (genre == MusicGenres.RAP){
            song = this.rapMusic.getSong().get(random.nextInt(3));

        }
        System.out.println("Playing " + song);
    }

}
