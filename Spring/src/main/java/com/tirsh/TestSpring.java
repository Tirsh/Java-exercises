package com.tirsh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Music music = context.getBean("music", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        System.out.println(musicPlayer.getMusic().getSong());
        context.close();
    }
}
