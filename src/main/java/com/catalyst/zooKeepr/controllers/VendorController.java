package com.catalyst.zooKeepr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.catalyst.zooKeepr.entities.Vendor;
import com.catalyst.zooKeepr.services.VendorService;

@RestController
public class VendorController {
	
	@Autowired
	VendorService vendorService;
	
	@RequestMapping(value="/vendor", method=RequestMethod.GET)
	public List<Vendor> getAllVendors() {
		return vendorService.getAllVendors();
	}
	
	@RequestMapping(value="/vendor", method=RequestMethod.POST)
	public void addVendor(@RequestBody Vendor vendor) {
		vendorService.addVendor(vendor);
	}

}
