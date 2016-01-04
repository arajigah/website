package com.catalyst.zooKeepr.daos;

import java.util.List;

import com.catalyst.zooKeepr.entities.FoodCategory;

public interface FoodCategoryDao {

	List<FoodCategory> getAllFoodCategories();

	void add(FoodCategory foodCategory);

}
