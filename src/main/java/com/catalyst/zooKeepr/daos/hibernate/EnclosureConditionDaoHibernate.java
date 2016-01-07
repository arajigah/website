package com.catalyst.zooKeepr.daos.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.catalyst.zooKeepr.daos.EnclosureConditionDao;
import com.catalyst.zooKeepr.entities.EnclosureCondition;

@Repository
@Transactional
public class EnclosureConditionDaoHibernate implements EnclosureConditionDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void setEM(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<EnclosureCondition> getEnclosureCondition() {
		return em.createQuery("SELECT s FROM EnclosureCondition s", EnclosureCondition.class).getResultList();
	}

	@Override
	public void add(EnclosureCondition enclosureCondition) {
		em.persist(enclosureCondition);
	}

	@Override
	public EnclosureCondition getEnclosureConditionById(Integer id) {
		return em.createQuery("SELECT s FROM EnclosureCondition s WHERE s.id = :id", EnclosureCondition.class)
				.setParameter("id", id).getSingleResult();
	}

}
