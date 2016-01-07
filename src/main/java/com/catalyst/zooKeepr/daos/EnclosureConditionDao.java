package com.catalyst.zooKeepr.daos;

import java.util.List;

import com.catalyst.zooKeepr.entities.EnclosureCondition;

public interface EnclosureConditionDao {

	List<EnclosureCondition> getEnclosureCondition();

	void add(EnclosureCondition enclosureCondition);

	EnclosureCondition getEnclosureConditionById(Integer id);

}
