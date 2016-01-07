package com.catalyst.zooKeepr.services.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import com.catalyst.zooKeepr.daos.VendorDao;
import com.catalyst.zooKeepr.entities.Enclosure;
import com.catalyst.zooKeepr.entities.Vendor;

public class VendorServiceImplTest {
	private VendorServiceImpl target;
	private VendorDao mockVendorDao;
	
	@Before
	public void setup() {
		target = new VendorServiceImpl();
		mockVendorDao = mock(VendorDao.class);
		target.setVendorDao(mockVendorDao);
	}
	
	@Test
	public void testAddVendorNullName() {
		Vendor v = new Vendor();
		target.addVendor(v);
		verify(mockVendorDao, times(1)).add(v);
	}
	
	@Test
	public void testAddVendorNull() {
		target.addVendor(null);
		verify(mockVendorDao, times(1)).add(null);
	}
	
	@Test
	public void testAddVendorValid() {
		Vendor v = new Vendor();
		v.setName("Amazing Bananas");
		target.addVendor(v);
		verify(mockVendorDao, times(1)).add(v);
	}
	
	@Test
	public void testGetVendor() {
		int expected = 1;
		List<Vendor> actualVendorList = new ArrayList<Vendor>();
		Vendor v = new Vendor();
		actualVendorList.add(v);
		when(mockVendorDao.getVendor()).thenReturn(actualVendorList);
		assertEquals(expected, target.getAllVendors().size());
	}
	
	@Test
	public void testGetVendorByIdSuccess() {
		target.getVendorById(1);
		verify(mockVendorDao, times(1)).getVendorById(1);
	}
}
