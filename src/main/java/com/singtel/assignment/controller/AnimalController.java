package com.singtel.assignment.controller;

import com.singtel.assignment.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    AnimalService animalService;

    @ResponseBody
    @GetMapping("/all")
    public List<String> getAllAnimals() {
        return animalService.getAll();
    }

    @ResponseBody
    @GetMapping("/canFly")
    public List<String> getFlyingAnimals() {
        return animalService.getCanFly();
    }

    @ResponseBody
    @GetMapping("/canWalk")
    public List<String> getWalkingAnimals() {
        return animalService.getCanWalk();
    }

    @ResponseBody
    @GetMapping("/canSing")
    public List<String> getSingingAnimals() {
        return animalService.getCanSing();
    }

    @ResponseBody
    @GetMapping("/canSwim")
    public List<String> getSwimmingAnimals() {
        return animalService.getCanSwim();
    }

}
