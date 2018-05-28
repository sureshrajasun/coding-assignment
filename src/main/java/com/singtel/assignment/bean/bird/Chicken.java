package com.singtel.assignment.bean.bird;

import com.singtel.assignment.bean.core.Bird;

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
