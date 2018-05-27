package com.singtel.assignment;

import com.singtel.assignment.fish.Clownfish;
import com.singtel.assignment.fish.Dolphin;
import com.singtel.assignment.fish.Fish;
import com.singtel.assignment.fish.Shark;
import com.singtel.assignment.base.Animal;
import com.singtel.assignment.base.Bird;
import com.singtel.assignment.bird.Chicken;
import com.singtel.assignment.bird.Duck;
import com.singtel.assignment.bird.Parrot;
import com.singtel.assignment.bird.Rooster;
import com.singtel.assignment.insect.Butterfly;

import java.lang.reflect.Field;

public class Solution {

    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
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
        };

        int flyCount = 0;
        int walkCount = 0;
        int swimCount = 0;
        int singCount = 0;

        for (Animal animal : animals){

            if (animal instanceof Bird){
                Bird bird = (Bird) animal;
                if("I am flying".equals(bird.fly())){
                    flyCount ++;
                }
            }

            if("I am walking".equals(animal.walk())){
                walkCount ++;
            }

            if (animal instanceof Duck || animal instanceof Fish || animal instanceof Dolphin){
                swimCount ++;
            }

            if (animal instanceof Bird){
                Bird bird  = (Bird) animal;
                if(!"I cannot sing".equals(bird.sing())){
                    singCount ++;
                }
            }else if(animal instanceof Rooster){
                singCount ++;
            }



        }

        System.out.printf("Number of Animals can fly %d", flyCount);
        System.out.printf("\nNumber of Animals can walk %d", walkCount);
        System.out.printf("\nNumber of Animals can sing %d", singCount);
        System.out.printf("\nNumber of Animals can swim %d", swimCount);

    }

}
