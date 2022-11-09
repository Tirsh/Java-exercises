package com.tirsh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
@Scope("singleton")
public class MusicPlayer {
    private Music classicMusic;
    private Music rapMusic;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Autowired
    public MusicPlayer(ClassicMusic classicMusic, RapMusic rapMusic) {
        this.classicMusic = classicMusic;
        this.rapMusic = rapMusic;
    }
    @PostConstruct
    public void doInit(){
        System.out.println("Start player!");
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
