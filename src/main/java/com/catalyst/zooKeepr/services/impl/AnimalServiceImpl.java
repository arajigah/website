package com.catalyst.zooKeepr.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.zooKeepr.daos.AnimalDao;
import com.catalyst.zooKeepr.services.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService {
	
	@Autowired
	AnimalDao animalDao;

}
