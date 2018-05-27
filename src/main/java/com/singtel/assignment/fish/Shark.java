package com.singtel.assignment.fish;


public class Shark extends Fish {

    public Shark(){
        super("Large", "Grey");
        name = "Shark";
    }

    public String eat(){
        return "I am eating other fishes";
    }

    public static void main(String[] args) {
        new Shark().size();
    }
}
