package com.catalyst.zooKeepr.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.zooKeepr.daos.VendorDao;
import com.catalyst.zooKeepr.entities.Vendor;
import com.catalyst.zooKeepr.services.VendorService;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorDao vendorDao;
	
	@Override
	public List<Vendor> getAllVendors() {
		return vendorDao.getVendor();
	}

	@Override
	public void addVendor(Vendor vendor) {
		vendorDao.add(vendor);
	}

	public void setVendorDao(VendorDao vendorDao) {
		this.vendorDao = vendorDao;
	}

}
