package com.catalyst.zooKeepr.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.zooKeepr.daos.EnclosureDao;
import com.catalyst.zooKeepr.services.EnclosureService;

@Service
public class EnclosureServiceImpl implements EnclosureService {
	
	@Autowired
	EnclosureDao enclosureDao;

}
