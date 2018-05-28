package com.singtel.assignment.bean.bird;

import com.singtel.assignment.bean.core.Bird;

public class Parrot extends Bird {

    private String sound;

    @Override
    public String sing(){
        return this.sound;
    }

    public Parrot(){name = "Parrot";}
    public Parrot(String sound){
        this();
        this.sound = sound;
    }
}
