package com.catalyst.zooKeepr.daos.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.catalyst.zooKeepr.daos.EnclosureDao;

@Repository
@Transactional
public class EnclosureDaoHibernate implements EnclosureDao {
	
	@PersistenceContext
	private EntityManager em;

}
