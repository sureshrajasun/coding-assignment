package com.singtel.assignment.bean.insect;

import com.singtel.assignment.bean.core.Bird;

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
