package com.catalyst.zooKeepr.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.zooKeepr.daos.EnclosureConditionDao;
import com.catalyst.zooKeepr.services.EnclosureConditionService;

@Service
public class EnclosureConditionServiceImpl implements EnclosureConditionService {
	
	@Autowired
	EnclosureConditionDao enclosureConditionDao;

}
