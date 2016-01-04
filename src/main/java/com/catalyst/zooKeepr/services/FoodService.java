package com.catalyst.zooKeepr.services;

import java.util.List;

import com.catalyst.zooKeepr.entities.Food;

public interface FoodService {

	List<Food> getAllFood();

	void addFood(Food food);

	void updateFood(Food food);

}