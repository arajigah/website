package com.catalyst.zooKeepr.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.zooKeepr.daos.FoodDao;
import com.catalyst.zooKeepr.services.FoodService;

@Service
public class FoodServiceImpl implements FoodService {
	
	@Autowired
	FoodDao foodDao;

}
