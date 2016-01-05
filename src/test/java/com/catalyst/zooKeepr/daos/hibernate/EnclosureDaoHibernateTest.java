package com.catalyst.zooKeepr.daos.hibernate;

import javax.persistence.EntityManager;

import org.junit.Before;

public class EnclosureDaoHibernateTest {
	
	private EnclosureDaoHibernate target;
	private EntityManager mockEm;
	
	@Before
	public void setup() {
		target = new EnclosureDaoHibernate();
		mockEm = mock(EntityManager.class);
		target.setEM(mockEm);
	}

}
