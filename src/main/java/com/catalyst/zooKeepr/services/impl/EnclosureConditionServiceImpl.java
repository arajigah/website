package com.catalyst.zooKeepr.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.zooKeepr.daos.EnclosureConditionDao;
import com.catalyst.zooKeepr.entities.EnclosureCondition;
import com.catalyst.zooKeepr.services.EnclosureConditionService;

@Service
public class EnclosureConditionServiceImpl implements EnclosureConditionService {
	
	@Autowired
	private EnclosureConditionDao enclosureConditionDao;

	@Override
	public List<EnclosureCondition> getAllEnclosureConditions() {
		return enclosureConditionDao.getEnclosureCondition();
	}

	@Override
	public void addEnclosureCondition(EnclosureCondition enclosureCondition) {
		enclosureConditionDao.add(enclosureCondition);
	}

}
