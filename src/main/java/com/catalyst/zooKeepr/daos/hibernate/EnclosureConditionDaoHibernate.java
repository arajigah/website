package com.catalyst.zooKeepr.daos.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.catalyst.zooKeepr.daos.EnclosureConditionDao;

@Repository
@Transactional
public class EnclosureConditionDaoHibernate implements EnclosureConditionDao {
	
	@PersistenceContext
	private EntityManager em;

}
