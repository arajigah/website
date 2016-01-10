package com.catalyst.zooKeepr.daos;

import java.util.List;

import com.catalyst.zooKeepr.entities.Food;

public interface FoodDao {

	List<Food> getFood();

	void add(Food food);

	void update(Food food);

	Food getFoodById(Integer id);
}
