package com.tirsh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private Music music;
    private String name;


    public MusicPlayer() {
    }

    @Autowired
    public MusicPlayer(Music music){
        this.music = music;
    }

    public List<Music> getMusicList() {
        return musicList;
    }


    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void playMusic() {
        for (Music music:musicList) {
            System.out.println(music.getSong());
        }
    }
    public String simplePlay(){
        return music.getSong();
    }
}
