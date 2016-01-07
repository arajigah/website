package com.catalyst.zooKeepr.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.zooKeepr.daos.FoodCategoryDao;
import com.catalyst.zooKeepr.entities.FoodCategory;
import com.catalyst.zooKeepr.services.FoodCategoryService;

@Service
public class FoodCategoryServiceImpl implements FoodCategoryService {
	
	@Autowired
	private FoodCategoryDao foodCategoryDao;

	@Override
	public List<FoodCategory> getAllFoodCategories() {
		return foodCategoryDao.getAllFoodCategories();
	}

	@Override
	public void addFoodCategory(FoodCategory foodCategory) {
		foodCategoryDao.add(foodCategory);
	}

	public void setFoodCategoryDao(FoodCategoryDao foodCategoryDao) {
		this.foodCategoryDao = foodCategoryDao;
	}

	@Override
	public FoodCategory getFoodCategoryById(Integer id) {
		return foodCategoryDao.getFoodCategoryById(id);
	}

}
