package com.catalyst.zooKeepr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.catalyst.zooKeepr.entities.FoodCategory;
import com.catalyst.zooKeepr.services.FoodCategoryService;

@RestController
public class FoodCategoryController {
	
	@Autowired
	FoodCategoryService foodCategoryService;
	
	@RequestMapping(value="/foodCategory", method=RequestMethod.GET)
	public List<FoodCategory> getAllFoodCategories() {
		return foodCategoryService.getAllFoodCategories();
	}
	
	@RequestMapping(value="/foodCategory", method=RequestMethod.POST)
	public void addFoodCategory(@RequestBody FoodCategory foodCategory) {
		foodCategoryService.addFoodCategory(foodCategory);
	}

}
