package com.catalyst.zooKeepr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.catalyst.zooKeepr.entities.Animal;
import com.catalyst.zooKeepr.entities.Enclosure;
import com.catalyst.zooKeepr.services.AnimalService;

@RestController
public class AnimalController {
	
	@Autowired
	AnimalService animalService;
	
	@RequestMapping(value="/animal", method=RequestMethod.GET)
	public List<Animal> getAllAnimals() {
		return animalService.getAllAnimals();
	}
	
	@RequestMapping(value="/animal/{id}", method=RequestMethod.GET)
	public Animal getAnimalById(@PathVariable Integer id) {
		return animalService.getAnimalById(id);
	}
	
	@RequestMapping(value="/animal", method=RequestMethod.POST)
	public void addAnimal(@RequestBody Animal animal) {
		animalService.addAnimal(animal);
	}
	
	@RequestMapping(value="/animal", method=RequestMethod.PUT)
	public void updateAnimal(@PathVariable int id, @RequestBody Animal animal) {
		animal.setId(id);
		animalService.updateAnimal(animal);
	}

}
