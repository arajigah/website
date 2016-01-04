package com.catalyst.zooKeepr.daos.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.catalyst.zooKeepr.daos.AnimalDao;

@Repository
@Transactional
public class AnimalDaoHibernate implements AnimalDao{
	
	@PersistenceContext
	private EntityManager em;

}
