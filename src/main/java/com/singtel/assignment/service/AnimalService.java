package com.singtel.assignment.service;

import com.singtel.assignment.repo.AnimalRepo;
import com.singtel.assignment.bean.core.Animal;
import com.singtel.assignment.bean.core.Bird;
import com.singtel.assignment.bean.bird.Duck;
import com.singtel.assignment.bean.bird.Rooster;
import com.singtel.assignment.bean.fish.Dolphin;
import com.singtel.assignment.bean.fish.Fish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AnimalService {

    @Autowired
    AnimalRepo animalRepo;

    public List<String> getAll() {
        List<String> animalName = new ArrayList<>();
        for (Animal animal : animalRepo.findAllAnimals()) {
            animalName.add(animal.name);
        }
        return animalName;
    }

    public List<String> getCanFly() {
        List<String> animalsCanFly = new ArrayList<>();

        for (Animal animal : animalRepo.findAllAnimals()) {
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

        for (Animal animal : animalRepo.findAllAnimals()) {
            if (animal instanceof Bird) {
                Bird bird = (Bird) animal;
                if ("I am walking".equals(animal.walk())) {
                    animalsCanWalk.add(animal.name);
                }

            }
        }
        return animalsCanWalk;
    }

    public List<String> getCanSwim() {
        List<String> animalsCanSwim = new ArrayList<>();
        for (Animal animal : animalRepo.findAllAnimals()) {
            if (animal instanceof Duck || animal instanceof Fish || animal instanceof Dolphin) {
                animalsCanSwim.add(animal.name);
            }
        }
        return animalsCanSwim;
    }

    public List<String> getCanSing() {
        List<String> animalsCanSwim = new ArrayList<>();
        for (Animal animal : animalRepo.findAllAnimals()) {
            if (animal instanceof Bird) {
                Bird bird = (Bird) animal;
                if (!"I cannot sing".equals(bird.sing())) {
                    animalsCanSwim.add(animal.name);
                }
            } else if (animal instanceof Rooster) {
                animalsCanSwim.add(animal.name);
            }
        }
        return animalsCanSwim;
    }


}
