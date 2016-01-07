package com.catalyst.zooKeepr.daos;

import java.util.List;

import com.catalyst.zooKeepr.entities.Vendor;

public interface VendorDao {

	List<Vendor> getVendor();

	void add(Vendor vendor);

	Vendor getVendorById(Integer id);

}
