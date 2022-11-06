package com.tirsh;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicMusic implements Music{
    private List<String> musicList = new ArrayList<>();
    {
        this.musicList.add("Moon light sonate");
        this.musicList.add("Rigoletto");
        this.musicList.add("Prokofiev: Romeo and Juliet, Op. 64 / Act 1 - Dance Of The Knights");
    }

//    private void makeInit(){
//        System.out.println("Make initialize");
//    }
//    private  void makeDestroy(){
//        System.out.println("Make destruction");
//    }
    @Override
    public List<String> getSong() {
        return musicList;
    }
}
