package com.singtel.assignment.bean.fish;

import com.singtel.assignment.bean.core.Animal;


public class Fish extends Animal {

    private String size;
    private String color;

    @Override
    public String walk(){
        return "I cannot walk";
    }

    public String sing(){
        return "I cannot sing";
    }

    public String swim(){
        return "I am swimming";
    }

    public String size(){
        return this.size;
    }

    public String color(){
        return this.size;
    }


    public Fish(){
        name = "Fish";
    }

    public Fish(String size, String color){
        this.size = size;
        this.color = color;
    }
}
