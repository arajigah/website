package com.catalyst.zooKeepr.daos.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.catalyst.zooKeepr.daos.TestDataDao;
import com.catalyst.zooKeepr.entities.TestData;

@Repository
@Transactional
public class TestDataDaoHibernate implements TestDataDao {

	@PersistenceContext
	private EntityManager em;
	
	
	public void setEm(EntityManager em) {
		this.em = em;
	}


	@Override
	public List<TestData> getTestData() {
		return em.createQuery("SELECT t FROM TestData t", TestData.class).
				getResultList();
	}

}
//Don't build on this, start a new class and DELETE this file!