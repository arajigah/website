package com.catalyst.zooKeepr.daos.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.catalyst.zooKeepr.daos.VendorDao;
import com.catalyst.zooKeepr.entities.Vendor;

@Repository
@Transactional
public class VendorDaoHibernate implements VendorDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void setEM(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<Vendor> getVendor() {
		return em.createQuery("SELECT v FROM Vendor v", Vendor.class).getResultList();
	}

	@Override
	public void add(Vendor vendor) {
		em.persist(vendor);
	}

}
