package com.catalyst.zooKeepr.services.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.catalyst.zooKeepr.daos.FoodDao;
import com.catalyst.zooKeepr.entities.Food;

public class FoodServiceImplTest {
	private FoodServiceImpl target;
	private FoodDao mockFoodDao;
	
	@Before
	public void setup() {
		target = new FoodServiceImpl();
		mockFoodDao = mock(FoodDao.class);
		target.setFoodDao(mockFoodDao);
	}
	
	@Test
	public void testAddFoodNullName() {
		Food f = new Food();
		target.addFood(f);
		verify(mockFoodDao, times(1)).add(f);
	}
	
	@Test
	public void testAddFoodNull() {
		target.addFood(null);
		verify(mockFoodDao, times(1)).add(null);
	}
	
	@Test
	public void testAddFoodValid() {
		Food f = new Food();
		f.setName("bananas");
		target.addFood(f);
		verify(mockFoodDao, times(1)).add(f);
	}
	
	@Test
	public void testUpdateFoodValid() {
		Food f = new Food();
		f.setName("strawberries");
		target.updateFood(f);
		verify(mockFoodDao, times(1)).update(f);
	}
	
	@Test
	public void testGetFood() {
		int expected = 1;
		List<Food> actualFoodList = new ArrayList<Food>();
		Food f = new Food();
		actualFoodList.add(f);
		when(mockFoodDao.getFood()).thenReturn(actualFoodList);
		assertEquals(expected, target.getAllFood().size());
	}
}
