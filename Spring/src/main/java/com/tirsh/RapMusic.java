package com.tirsh;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music{
    private List<String> musicList = new ArrayList<>();
   {
        this.musicList.add("Drop it, like it's hot");
        this.musicList.add("Still D.R.E.");
        this.musicList.add("Molodie vetra");
    }
    @Override
    public List<String> getSong() {
        return musicList;
    }
}
