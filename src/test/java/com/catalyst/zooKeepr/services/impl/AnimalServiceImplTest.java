package com.catalyst.zooKeepr.services.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.catalyst.zooKeepr.daos.AnimalDao;
import com.catalyst.zooKeepr.entities.Animal;

public class AnimalServiceImplTest {
	private AnimalServiceImpl target;
	private AnimalDao mockAnimalDao;
	
	@Before
	public void setup() {
		target = new AnimalServiceImpl();
		mockAnimalDao = mock(AnimalDao.class);
		target.setAnimalDao(mockAnimalDao);
	}
	
	@Test
	public void testAddAnimalNullName() {
		Animal e = new Animal();
		target.addAnimal(e);
		verify(mockAnimalDao, times(1)).add(e);
	}
	
	@Test
	public void testAddAnimalNull() {
		target.addAnimal(null);
		verify(mockAnimalDao, times(1)).add(null);
	}
	
	@Test
	public void testAddAnimalValid() {
		Animal e = new Animal();
		e.setName("monkey");
		target.addAnimal(e);
		verify(mockAnimalDao, times(1)).add(e);
	}
	
	@Test
	public void testUpdateAnimalValid() {
		Animal e = new Animal();
		e.setName("bird");
		target.updateAnimal(e);
		verify(mockAnimalDao, times(1)).update(e);
	}
	
	@Test
	public void testGetAnimals() {
		int expected = 1;
		List<Animal> actualAnimalList = new ArrayList<Animal>();
		Animal e = new Animal();
		actualAnimalList.add(e);
		when(mockAnimalDao.getAllAnimals()).thenReturn(actualAnimalList);
		assertEquals(expected, target.getAllAnimals().size());
	}
	
	@Test
	public void testGetAnimalsByIdSuccess() {
		target.getAnimalById(1);
		verify(mockAnimalDao, times(1)).getAnimalById(1);
	}
	
	@Test
	public void testRemoveAnimal() {
		target.deleteAnimal(1);
		verify(mockAnimalDao, times(1)).delete(1);
	}
}
