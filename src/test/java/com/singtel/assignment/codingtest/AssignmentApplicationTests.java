package com.singtel.assignment.codingtest;

import com.singtel.assignment.base.Animal;
import com.singtel.assignment.service.AnimalService;
import org.assertj.core.util.Lists;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AssignmentApplicationTests {

	@Autowired
	AnimalService animalService;

	@Test
	public void getOnlyWalkingAnimalsTest() {
		List<String> walkingAnimals =  Lists.newArrayList("Bird","Duck","Chicken","Parrot","Caterpillar");
		Assert.assertEquals( walkingAnimals, animalService.getCanWalk());
	}

	@Test
	public void getOnlySwimmingAnimalsTest() {
		List<String> swimmingAnimals =  Lists.newArrayList("Duck","Fish","Shark","ClownFish","Dolphin");
		Assert.assertEquals( swimmingAnimals, animalService.getCanSwim());
	}


	@Test
	public void getOnlySingingAnimalsTest() {
		List<String> singingAnimals =  Lists.newArrayList("Bird","Duck","Chicken","Rooster","Parrot");
		Assert.assertEquals( singingAnimals, animalService.getCanSing());
	}


	@Test
	public void getOnlyFlyingAnimalsTest() {
		List<String> flyingAnimals =  Lists.newArrayList("Bird","Duck","Parrot","Butterfly");
		Assert.assertEquals( flyingAnimals, animalService.getCanFly());
	}

}
