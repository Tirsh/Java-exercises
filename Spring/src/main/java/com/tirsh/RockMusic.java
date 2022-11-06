package com.tirsh;

import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class RockMusic implements Music{
    List<String> list;
    @Override
    public List<String> getSong() {
        return list;
    }
}
