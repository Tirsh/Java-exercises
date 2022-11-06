package com.tirsh;

import org.springframework.stereotype.Component;

//@Component
public class RapMusic implements Music{
    private RapMusic(){}
    public static RapMusic getRapMusic(){
        return new RapMusic();
    }
    @Override
    public String getSong() {
        return "Drop it, like it's hot";
    }
}
