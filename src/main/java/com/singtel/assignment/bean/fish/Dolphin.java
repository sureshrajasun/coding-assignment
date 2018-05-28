package com.singtel.assignment.bean.fish;

import com.singtel.assignment.bean.core.Animal;


public class Dolphin extends Animal {

    Fish fish;

    public Dolphin(){
        name= "Dolphin";
        fish = new Fish("Large", "BlackAndWhite");
    }

    public void swim(){
        fish.swim();
    }

}
