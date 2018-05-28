package com.singtel.assignment.bean.core;

public class Bird extends Animal {

    public Bird(){
        name = "Bird";
    }

    public String fly() {
        return "I am flying" ;
    }
    public String sing() {
        return "I am singing" ;
    }
}
