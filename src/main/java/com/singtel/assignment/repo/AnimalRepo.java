package com.singtel.assignment.repo;

import com.singtel.assignment.bean.core.Animal;
import com.singtel.assignment.bean.core.Bird;
import com.singtel.assignment.bean.bird.Chicken;
import com.singtel.assignment.bean.bird.Duck;
import com.singtel.assignment.bean.bird.Parrot;
import com.singtel.assignment.bean.bird.Rooster;
import com.singtel.assignment.bean.fish.Clownfish;
import com.singtel.assignment.bean.fish.Dolphin;
import com.singtel.assignment.bean.fish.Fish;
import com.singtel.assignment.bean.fish.Shark;
import com.singtel.assignment.bean.insect.Butterfly;
import com.singtel.assignment.bean.insect.Caterpillar;
import org.springframework.stereotype.Repository;

@Repository
public class AnimalRepo {

    public Animal[] findAllAnimals(){
       return new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Butterfly(),
                new Caterpillar()
        };
    }


}
