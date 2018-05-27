package com.singtel.assignment.fish;

import com.singtel.assignment.base.Animal;


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
