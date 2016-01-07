package com.catalyst.zooKeepr.daos;

import java.util.List;

import com.catalyst.zooKeepr.entities.Animal;

public interface AnimalDao {

	List<Animal> getAllAnimals();

	void add(Animal animal);

	void update(Animal animal);

	Animal getAnimalById(Integer id);
	
	

}
