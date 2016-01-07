package com.catalyst.zooKeepr.services.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

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
	public void testAddEnclosureConditionNull() {
		target.addEnclosureCondition(null);
		verify(mockEnclosureConditionDao, times(1)).add(null);
	}
	
	@Test
	public void testAddEnclosureConditionValid() {
		EnclosureCondition c = new EnclosureCondition();
		c.setCondition("dirty");
		target.addEnclosureCondition(c);
		verify(mockEnclosureConditionDao, times(1)).add(c);
	}
	
	@Test
	public void testGetEnclosureConditions() {
		int expected = 1;
		List<EnclosureCondition> actualEnclosureConditionList = new ArrayList<EnclosureCondition>();
		EnclosureCondition c = new EnclosureCondition();
		actualEnclosureConditionList.add(c);
		when(mockEnclosureConditionDao.getEnclosureCondition()).thenReturn(actualEnclosureConditionList);
		assertEquals(expected, target.getAllEnclosureConditions().size());
	}
	
	@Test
	public void testGetEnclosureConditionsByIdSuccess() {
		target.getEnclosureConditionById(1);
		verify(mockEnclosureConditionDao, times(1)).getEnclosureConditionById(1);
	}
}
