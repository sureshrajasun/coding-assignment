package com.singtel.assignment.codingtest;

import com.singtel.assignment.repo.AnimalRepo;
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
import com.singtel.assignment.service.AnimalService;
import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnimalServiceTest {

    @Mock
    AnimalRepo animalRepo;

    @InjectMocks
    AnimalService animalService;


    @Before
    public void setup() {
        when(animalRepo.findAllAnimals()).thenReturn(new Animal[]{
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
                new Caterpillar()});
    }

    @Test
    public void getAllAnimalsTest() {
        List<String> walkingAnimals = Lists.newArrayList("Bird", "Duck", "Chicken", "Rooster", "Parrot",
                "Fish", "Shark", "ClownFish", "Dolphin", "Butterfly", "Caterpillar");
        assertEquals(walkingAnimals, animalService.getAll());
    }

    @Test
    public void getOnlyWalkingAnimalsTest() {
        List<String> walkingAnimals = Lists.newArrayList("Bird", "Duck", "Chicken", "Parrot", "Caterpillar");
        assertEquals(walkingAnimals, animalService.getCanWalk());
    }

    @Test
    public void getOnlySwimmingAnimalsTest() {
        List<String> swimmingAnimals = Lists.newArrayList("Duck", "Fish", "Shark", "ClownFish", "Dolphin");
        assertEquals(swimmingAnimals, animalService.getCanSwim());
    }


    @Test
    public void getOnlySingingAnimalsTest() {
        List<String> singingAnimals = Lists.newArrayList("Bird", "Duck", "Chicken", "Rooster", "Parrot");
        assertEquals(singingAnimals, animalService.getCanSing());
    }


    @Test
    public void getOnlyFlyingAnimalsTest() {
        List<String> flyingAnimals = Lists.newArrayList("Bird", "Duck", "Parrot", "Butterfly");
        assertEquals(flyingAnimals, animalService.getCanFly());
    }

}
