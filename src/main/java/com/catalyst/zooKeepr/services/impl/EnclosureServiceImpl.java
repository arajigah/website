package com.catalyst.zooKeepr.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.zooKeepr.daos.EnclosureDao;
import com.catalyst.zooKeepr.entities.Enclosure;
import com.catalyst.zooKeepr.services.EnclosureService;

@Service
public class EnclosureServiceImpl implements EnclosureService {
	
	@Autowired
	private EnclosureDao enclosureDao;

	@Override
	public List<Enclosure> getEnclosure() {
		return enclosureDao.getEnclosure();
	}
	
	@Override
	public Enclosure getEnclosureById(Integer id) {
		return enclosureDao.getEnclosureById(id);
	}

	@Override
	public void addEnclosure(Enclosure enclosure) {
		enclosureDao.add(enclosure);
	}

	@Override
	public void updateEnclosure(Enclosure enclosure) {
		enclosureDao.update(enclosure);
	}

	@Override
	public void deleteEnclosure(Integer id) {
		enclosureDao.delete(id);
	}

	public void setEnclosureDao(EnclosureDao enclosureDao) {
		this.enclosureDao = enclosureDao;
	}

}
