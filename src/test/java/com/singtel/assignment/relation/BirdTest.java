package com.singtel.assignment.relation;

import com.singtel.assignment.Solution;
import com.singtel.assignment.bean.bird.Chicken;
import com.singtel.assignment.bean.bird.Duck;
import com.singtel.assignment.bean.bird.Parrot;
import com.singtel.assignment.bean.bird.Rooster;
import com.singtel.assignment.bean.core.Animal;
import com.singtel.assignment.bean.core.Bird;
import com.singtel.assignment.bean.insect.Butterfly;
import com.singtel.assignment.bean.insect.Caterpillar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BirdTest {

    Animal[] animals;

    Solution.GetAnimalActivities getAnimalActivities;

    @Before
    public void setup(){
        animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Butterfly(),
                new Caterpillar()
        };

        getAnimalActivities = new Solution.GetAnimalActivities(animals).invoke();
    }

    @Test
    public void testBirdsCanFly(){
       assertEquals(new Integer(4), getAnimalActivities.getFlyCount());
    }

    @Test
    public void testBirdsCanWalk(){
        assertEquals(new Integer(6), getAnimalActivities.getWalkCount());
    }

    @Test
    public void testBirdsCanSwim(){
        assertEquals(new Integer(1), getAnimalActivities.getSwimCount());
    }

    @Test
    public void testBirdsCanSing(){
        assertEquals(new Integer(5), getAnimalActivities.getSingCount());
    }



}
