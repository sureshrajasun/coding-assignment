package com.singtel.assignment;

import com.singtel.assignment.bean.fish.Clownfish;
import com.singtel.assignment.bean.fish.Dolphin;
import com.singtel.assignment.bean.fish.Fish;
import com.singtel.assignment.bean.fish.Shark;
import com.singtel.assignment.bean.core.Animal;
import com.singtel.assignment.bean.core.Bird;
import com.singtel.assignment.bean.bird.Chicken;
import com.singtel.assignment.bean.bird.Duck;
import com.singtel.assignment.bean.bird.Parrot;
import com.singtel.assignment.bean.bird.Rooster;
import com.singtel.assignment.bean.insect.Butterfly;

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

        GetAnimalActivities getAnimalActivities = new GetAnimalActivities(animals).invoke();

        System.out.printf("Number of Animals can fly %d", getAnimalActivities.getFlyCount());
        System.out.printf("\nNumber of Animals can walk %d", getAnimalActivities.getWalkCount());
        System.out.printf("\nNumber of Animals can sing %d", getAnimalActivities.getSingCount());
        System.out.printf("\nNumber of Animals can swim %d", getAnimalActivities.getSwimCount());

    }

    public static class GetAnimalActivities {
        private Animal[] animals;
        private Integer flyCount;
        private Integer walkCount;
        private Integer swimCount;
        private Integer singCount;

        public GetAnimalActivities(Animal[] animals) {
            this.animals = animals;
            this.flyCount = 0;
            this.walkCount = 0;
            this.swimCount = 0;
            this.singCount = 0;
        }

        public Integer getFlyCount() {
            return flyCount;
        }

        public Integer getWalkCount() {
            return walkCount;
        }

        public Integer getSwimCount() {
            return swimCount;
        }

        public Integer getSingCount() {
            return singCount;
        }

        public GetAnimalActivities invoke() {
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
            return this;
        }
    }
}
