package com.catalyst.zooKeepr.services;

import java.util.List;

import com.catalyst.zooKeepr.entities.Animal;

public interface AnimalService {

	List<Animal> getAllAnimals();

	void addAnimal(Animal animal);

	void updateAnimal(Animal animal);

}