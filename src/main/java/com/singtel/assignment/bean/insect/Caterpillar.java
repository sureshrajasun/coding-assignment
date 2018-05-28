package com.singtel.assignment.bean.insect;

public class Caterpillar extends Butterfly{

    public Caterpillar(){
        name = "Caterpillar";
    }
    @Override
    public String fly() {
        return "I cannot fly";
    }

    @Override
    public String walk(){
        return "I am walking";
    }

}
