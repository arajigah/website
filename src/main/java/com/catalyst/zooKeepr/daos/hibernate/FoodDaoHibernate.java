package com.catalyst.zooKeepr.daos.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.catalyst.zooKeepr.daos.FoodDao;

@Repository
@Transactional
public class FoodDaoHibernate implements FoodDao {
	
	@PersistenceContext
	private EntityManager em;

}
