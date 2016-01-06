package com.catalyst.zooKeepr.daos;

import java.util.List;

import com.catalyst.zooKeepr.entities.Enclosure;

public interface EnclosureDao {

	List<Enclosure> getEnclosure();

	void add(Enclosure enclosure);

	void update(Enclosure enclosure);

	void delete(Integer id);	
}
