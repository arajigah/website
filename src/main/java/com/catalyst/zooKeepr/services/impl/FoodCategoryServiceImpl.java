package com.catalyst.zooKeepr.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.zooKeepr.daos.FoodCategoryDao;
import com.catalyst.zooKeepr.services.FoodCategoryService;

@Service
public class FoodCategoryServiceImpl implements FoodCategoryService {
	
	@Autowired
	FoodCategoryDao foodCategoryDao;

}
