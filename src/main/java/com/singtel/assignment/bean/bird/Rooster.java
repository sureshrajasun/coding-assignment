package com.singtel.assignment.bean.bird;

import com.singtel.assignment.bean.core.Animal;


public class Rooster extends Animal {

    private Chicken chicken;

    public Rooster(){
        this.name = "Rooster";
        this.chicken = new Chicken("Cock-a-doodle-doo");
    }

    public String sing() {
        return this.chicken.sing();
    }

}

