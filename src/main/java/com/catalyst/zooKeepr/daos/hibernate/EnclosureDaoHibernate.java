package com.catalyst.zooKeepr.daos.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.catalyst.zooKeepr.daos.EnclosureDao;
import com.catalyst.zooKeepr.entities.Enclosure;

@Repository
@Transactional
public class EnclosureDaoHibernate implements EnclosureDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void setEM(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<Enclosure> getEnclosure() {
		return em.createQuery("SELECT e FROM Enclosure e", Enclosure.class).getResultList();
	}

	@Override
	public void add(Enclosure enclosure) {
		em.persist(enclosure);
	}

	@Override
	public void update(Enclosure enclosure) {
		em.merge(enclosure);
	}

	@Override
	public void delete(Integer id) {
		Enclosure enclosure = getEnclocureById(id);
		em.remove(enclosure);
	}
	
	public Enclosure getEnclocureById(Integer id){
		return em.createQuery("SELECT e FROM Enclosure e WHERE e.id = :id", Enclosure.class).setParameter("id", id).getSingleResult();
		
	}

}
