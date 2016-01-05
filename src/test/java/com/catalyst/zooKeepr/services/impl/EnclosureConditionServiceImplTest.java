package com.catalyst.zooKeepr.services.impl;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import com.catalyst.zooKeepr.daos.EnclosureConditionDao;
import com.catalyst.zooKeepr.entities.EnclosureCondition;

public class EnclosureConditionServiceImplTest {
	private EnclosureConditionServiceImpl target;
	private EnclosureConditionDao mockEnclosureConditionDao;
	
	@Before
	public void setup() {
		target = new EnclosureConditionServiceImpl();
		mockEnclosureConditionDao = mock(EnclosureConditionDao.class);
		target.setEnclosureConditionDao(mockEnclosureConditionDao);
	}
	
	@Test
	public void testAddEnclosureConditionNullName() {
		EnclosureCondition c = new EnclosureCondition();
		target.addEnclosureCondition(c);
		verify(mockEnclosureConditionDao, times(1)).add(c);
	}
	
	@Test
	public void testAddEnclosureConditionValid() {
		EnclosureCondition c = new EnclosureCondition();
		c.setCondition("dirty");
		target.addEnclosureCondition(c);
		verify(mockEnclosureConditionDao, times(1)).add(c);
	}
}
