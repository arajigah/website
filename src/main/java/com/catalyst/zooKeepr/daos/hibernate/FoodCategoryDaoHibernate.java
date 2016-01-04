package com.catalyst.zooKeepr.daos.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.catalyst.zooKeepr.daos.FoodCategoryDao;

@Repository
@Transactional
public class FoodCategoryDaoHibernate implements FoodCategoryDao {
	
	@PersistenceContext
	private EntityManager em;

}
