package com.catalyst.zooKeepr.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.zooKeepr.daos.AnimalDao;
import com.catalyst.zooKeepr.entities.Animal;
import com.catalyst.zooKeepr.services.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService {
	
	@Autowired
	private AnimalDao animalDao;

	@Override
	public List<Animal> getAllAnimals() {
		return animalDao.getAllAnimals();
	}

	@Override
	public void addAnimal(Animal animal) {
		animalDao.add(animal);
	}

	@Override
	public void updateAnimal(Animal animal) {
		animalDao.update(animal);
	}

}
