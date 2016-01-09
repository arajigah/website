package com.catalyst.zooKeepr.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.zooKeepr.daos.FoodDao;
import com.catalyst.zooKeepr.entities.Food;
import com.catalyst.zooKeepr.services.FoodService;

@Service
public class FoodServiceImpl implements FoodService {
	
	@Autowired
	private FoodDao foodDao;

	@Override
	public List<Food> getAllFood() {
		return foodDao.getFood();
	}
	
	@Override
	public Food getFoodById(Integer id) {
		return foodDao.getFoodById(id);
	}

	@Override
	public void addFood(Food food) {
		foodDao.add(food);
	}

	@Override
	public void updateFood(Food food) {
		foodDao.update(food);
	}

	public void setFoodDao(FoodDao foodDao) {
		this.foodDao = foodDao;		
	}

	@Override
	public void deleteFood(Integer id) {
		foodDao.delete(id);
		
	}

}
