package com.singtel.assignment.insect;

import com.singtel.assignment.base.Bird;

public class Butterfly extends Bird {

    public Butterfly(){
        name = "Butterfly";
    }

    @Override
    public String walk(){
        return "I cannot walk";
    }

    @Override
    public String sing() {
        return "I cannot sing";
    }



}
