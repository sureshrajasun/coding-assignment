package com.singtel.assignment.bean.bird;

import com.singtel.assignment.bean.core.Bird;

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
