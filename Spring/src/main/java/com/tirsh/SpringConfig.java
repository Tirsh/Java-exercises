package com.tirsh;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.tirsh")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
//    @Bean
//    @Scope("prototype")
//    public ClassicalMusic classicalMusic() {
//        return new ClassicalMusic();
//    }
//
//    @Bean
//    public RockMusic rockMusic() {
//        return new RockMusic();
//    }
//
//    @Bean
//    public JazzMusic jazzMusic() {
//        return new JazzMusic();
//    }
//
//    @Bean
//    public List<Music> musicList() {
//        // Этот лист неизменяемый (immutable)
//        return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic());
//    }
//
//    @Bean
//    public MusicPlayer musicPlayer() {
//        return new MusicPlayer(musicList());
//    }
//
//    @Bean
//    public Computer computer() {
//        return new Computer(musicPlayer());
//    }
}
