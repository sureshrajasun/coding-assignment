package com.singtel.assignment.bird;

import com.singtel.assignment.base.Bird;

public class Chicken extends Bird {

    private String sound;

    @Override
    public String fly() {
        return "I can't fly";
    }

    @Override
    public String sing() {
        return sound;
    }

    public Chicken(){
        name = "Chicken";
        sound = "Cluck, cluck";
    }
    public  Chicken(String sound){
        this();
        this.sound = sound;
    }
}
