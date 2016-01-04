package com.catalyst.zooKeepr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.catalyst.zooKeepr.entities.Food;
import com.catalyst.zooKeepr.services.FoodService;

@RestController
public class FoodController {
	
	@Autowired
	FoodService foodService;
	
	@RequestMapping(value="/food", method=RequestMethod.GET) 
	public List<Food> getAllFood() {  
		return foodService.getAllFood();
	}
	
	@RequestMapping(value="/food", method=RequestMethod.POST)
	public void addFood(@RequestBody Food food) {
		foodService.addFood(food);
	}
	
	@RequestMapping(value="/food", method=RequestMethod.PUT)
	public void updateFood(@PathVariable int id, @RequestBody Food food) {
		foodService.updateFood(food);
	}

}
