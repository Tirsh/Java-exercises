package com.tirsh;

public class ClassicMusic implements Music{
    private void makeInit(){
        System.out.println("Make initialize");
    }
    private  void makeDestroy(){
        System.out.println("Make destruction");
    }
    @Override
    public String getSong() {
        return "Moon light sonate";
    }
}
