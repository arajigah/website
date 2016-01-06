package com.catalyst.zooKeepr.services;

import java.util.List;

import com.catalyst.zooKeepr.entities.Enclosure;

public interface EnclosureService {

	List<Enclosure> getEnclosure();

	void addEnclosure(Enclosure enclosure);

	void updateEnclosure(Enclosure enclosure);

	void deleteEnclosure(Integer id);

	Enclosure getEnclosureById(Integer id);

}
