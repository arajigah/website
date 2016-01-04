package com.catalyst.zooKeepr.services;

import java.util.List;

import com.catalyst.zooKeepr.entities.EnclosureCondition;

public interface EnclosureConditionService {

	List<EnclosureCondition> getAllEnclosureConditions();

	void addEnclosureCondition(EnclosureCondition enclosureCondition);
	
}
