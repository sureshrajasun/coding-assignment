package com.singtel.assignment.bird;

import com.singtel.assignment.base.Bird;

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
