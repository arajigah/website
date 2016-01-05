package com.catalyst.zooKeepr.services.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import com.catalyst.zooKeepr.daos.EnclosureDao;
import com.catalyst.zooKeepr.entities.Enclosure;

public class EnclosureServiceImplTest {
	private EnclosureServiceImpl target;
	private EnclosureDao mockEnclosureDao;
	
	@Before
	public void setup() {
		target = new EnclosureServiceImpl();
		mockEnclosureDao = mock(EnclosureDao.class);
		target.setEnclosureDao(mockEnclosureDao);
	}
	
	@Test
	public void testAddEnclosureNullName() {
		Enclosure e = new Enclosure();
		target.addEnclosure(e);
		verify(mockEnclosureDao, times(1)).add(e);
	}
	
	@Test
	public void testAddEnclosureValid() {
		Enclosure e = new Enclosure();
		e.setName("enclosure");
		target.addEnclosure(e);
		verify(mockEnclosureDao, times(1)).add(e);
	}
	
	@Test
	public void testGetEnclosures() {
		int expected = 1;
		List<Enclosure> actualEnclosureList = new ArrayList<Enclosure>();
		Enclosure e = new Enclosure();
		actualEnclosureList.add(e);
		when(mockEnclosureDao.getEnclosure()).thenReturn(actualEnclosureList);
		assertEquals(expected, target.getEnclosure().size());
	}
	
	@Test
	public void testUpdateEnclosure() {
		
	}

}
