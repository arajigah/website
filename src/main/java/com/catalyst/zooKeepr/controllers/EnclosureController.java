package com.catalyst.zooKeepr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.catalyst.zooKeepr.entities.Enclosure;
import com.catalyst.zooKeepr.services.EnclosureService;

@RestController
public class EnclosureController {
	
	@Autowired
	EnclosureService enclosureService;
	
	@RequestMapping(value="/enclosure", method=RequestMethod.GET)
	public List<Enclosure> getEnclosure() {
		return enclosureService.getEnclosure();
	}
	
	@RequestMapping(value="/enclosure", method=RequestMethod.POST)
	public void addEnclosure(@RequestBody Enclosure enclosure) {
		System.out.println(enclosure);
		enclosureService.addEnclosure(enclosure);
	}
	
	@RequestMapping(value="enclosure/{id}", method=RequestMethod.PUT)
	public void updateById(@PathVariable int id, @RequestBody Enclosure enclosure) {
		enclosure.setId(id);
		enclosureService.updateEnclosure(enclosure);
	}
	
	@RequestMapping(value="/enclosure/{id}", method=RequestMethod.DELETE)
	public void deleteEnclosure(@PathVariable Integer id) {
		enclosureService.deleteEnclosure(id);
	}

}
