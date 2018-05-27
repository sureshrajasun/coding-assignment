package com.singtel.assignment.service;

import com.singtel.assignment.base.Animal;
import com.singtel.assignment.base.Bird;
import com.singtel.assignment.bird.Chicken;
import com.singtel.assignment.bird.Duck;
import com.singtel.assignment.bird.Parrot;
import com.singtel.assignment.bird.Rooster;
import com.singtel.assignment.fish.Clownfish;
import com.singtel.assignment.fish.Dolphin;
import com.singtel.assignment.fish.Fish;
import com.singtel.assignment.fish.Shark;
import com.singtel.assignment.insect.Butterfly;
import com.singtel.assignment.insect.Caterpillar;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class AnimalService {

    Animal[] animals;
    @PostConstruct
    public void init(){
        animals = new Animal[]{
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

    public List<String> getAll() {
        List<String> animalName = new ArrayList<>();
        for (Animal animal : animals) {
            animalName.add(animal.name);
        }
        return animalName;
    }

    public List<String> getCanFly() {
        List<String> animalsCanFly = new ArrayList<>();

        for (Animal animal : animals) {
            if (animal instanceof Bird) {
                Bird bird = (Bird) animal;
                if ("I am flying".equals(bird.fly())) {
                    animalsCanFly.add(animal.name);
                }
            }
        }
        return animalsCanFly;
    }

    public List<String> getCanWalk() {
        List<String> animalsCanWalk = new ArrayList<>();

        for (Animal animal : animals) {
            if (animal instanceof Bird) {
                Bird bird = (Bird) animal;
                if("I am walking".equals(animal.walk())){
                    animalsCanWalk.add(animal.name);
                }

            }
        }
        return animalsCanWalk;
    }

    public List<String> getCanSwim() {
        List<String> animalsCanSwim = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Duck || animal instanceof Fish || animal instanceof Dolphin){
                animalsCanSwim.add(animal.name);
            }
        }
        return animalsCanSwim;
    }

    public List<String> getCanSing() {
        List<String> animalsCanSwim = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Bird){
                Bird bird  = (Bird) animal;
                if(!"I cannot sing".equals(bird.sing())){
                    animalsCanSwim.add(animal.name);
                }
            }else if(animal instanceof Rooster){
                animalsCanSwim.add(animal.name);
            }
        }
        return animalsCanSwim;
    }


}
