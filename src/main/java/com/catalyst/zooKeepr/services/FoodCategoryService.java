package com.catalyst.zooKeepr.services;

import java.util.List;

import com.catalyst.zooKeepr.entities.FoodCategory;

public interface FoodCategoryService {

	List<FoodCategory> getAllFoodCategories();

	void addFoodCategory(FoodCategory foodCategory);

}
