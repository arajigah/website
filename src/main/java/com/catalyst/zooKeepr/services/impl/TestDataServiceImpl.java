package com.catalyst.zooKeepr.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.zooKeepr.daos.TestDataDao;
import com.catalyst.zooKeepr.entities.TestData;
import com.catalyst.zooKeepr.services.TestDataService;

@Service
public class TestDataServiceImpl implements TestDataService {

	@Autowired
	TestDataDao testDataDao;
	
	
	public void setTestDataDao(TestDataDao testDataDao) {
		this.testDataDao = testDataDao;
	}


	@Override
	public List<TestData> getTestData() {
		return testDataDao.getTestData();
	}

}
//Don't build on this, start a new class and DELETE this file!