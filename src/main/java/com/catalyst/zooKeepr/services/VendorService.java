package com.catalyst.zooKeepr.services;

import java.util.List;

import com.catalyst.zooKeepr.entities.Vendor;

public interface VendorService {

	List<Vendor> getAllVendors();

	void addVendor(Vendor vendor);

	Vendor getVendorById(Integer id);
	
}
