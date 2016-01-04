package com.catalyst.zooKeepr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.catalyst.zooKeepr.entities.EnclosureCondition;
import com.catalyst.zooKeepr.services.EnclosureConditionService;

@RestController
public class EnclosureConditionController {

	@Autowired
	EnclosureConditionService enclosureConditionService;
	
	@RequestMapping(value="/condition", method=RequestMethod.GET)
	public List<EnclosureCondition> getAllEnclosureConditions() {
		return enclosureConditionService.getAllEnclosureConditions();
	}
	
	@RequestMapping(value="/condition", method=RequestMethod.POST)
	public void addEnclosureCondition(@RequestBody EnclosureCondition enclosureCondition) {
		enclosureConditionService.addEnclosureCondition(enclosureCondition);
	}
}
