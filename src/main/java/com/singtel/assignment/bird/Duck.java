package com.singtel.assignment.bird;

import com.singtel.assignment.base.Bird;

public class Duck extends Bird {

    public Duck(){
        name = "Duck";
    }
    @Override
    public String sing() {
        return "Quack, quack";
    }

    public String swim() {
        return  "I am swimming";
    }
}
