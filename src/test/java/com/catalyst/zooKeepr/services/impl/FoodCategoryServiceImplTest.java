package com.catalyst.zooKeepr.services.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.catalyst.zooKeepr.daos.FoodCategoryDao;
import com.catalyst.zooKeepr.entities.FoodCategory;

public class FoodCategoryServiceImplTest {
	private FoodCategoryServiceImpl target;
	private FoodCategoryDao mockFoodCategoryDao;
	
	@Before
	public void setup() {
		target = new FoodCategoryServiceImpl();
		mockFoodCategoryDao = mock(FoodCategoryDao.class);
		target.setFoodCategoryDao(mockFoodCategoryDao);
	}
	
	@Test
	public void testAddFoodCategoryNullName() {
		FoodCategory c = new FoodCategory();
		target.addFoodCategory(c);
		verify(mockFoodCategoryDao, times(1)).add(c);
	}
	
	@Test
	public void testAddFoodCategoryNull() {
		target.addFoodCategory(null);
		verify(mockFoodCategoryDao, times(1)).add(null);
	}
	
	@Test
	public void testAddFoodCategoryValid() {
		FoodCategory c = new FoodCategory();
		c.setCategory("fruit");
		target.addFoodCategory(c);
		verify(mockFoodCategoryDao, times(1)).add(c);
	}
	
	@Test
	public void testGetFoodCategories() {
		int expected = 1;
		List<FoodCategory> actualFoodCategoryList = new ArrayList<FoodCategory>();
		FoodCategory c = new FoodCategory();
		actualFoodCategoryList.add(c);
		when(mockFoodCategoryDao.getAllFoodCategories()).thenReturn(actualFoodCategoryList);
		assertEquals(expected, target.getAllFoodCategories().size());
	}
	
	@Test
	public void testGetFoodCategoriesByIdSuccess() {
		target.getFoodCategoryById(1);
		verify(mockFoodCategoryDao, times(1)).getFoodCategoryById(1);
	}
	
}
