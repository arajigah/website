package com.catalyst.zooKeepr.daos.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.catalyst.zooKeepr.daos.AnimalDao;
import com.catalyst.zooKeepr.entities.Animal;

@Repository
@Transactional
public class AnimalDaoHibernate implements AnimalDao{
	
	@PersistenceContext
	private EntityManager em;
	
	public void setEM(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<Animal> getAllAnimals() {
		return em.createQuery("SELECT a FROM Animal a", Animal.class).getResultList();
	}

	@Override
	public void add(Animal animal) {
		em.persist(animal);
	}

	@Override
	public void update(Animal animal) {
		em.merge(animal);
	}

	@Override
	public Animal getAnimalById(Integer id) {
		return em.createQuery("SELECT a FROM Animal a WHERE a.id = :id", Animal.class)
				.setParameter("id", id).getSingleResult();
	}

	@Override
	public void delete(Integer id) {
		Animal animal = getAnimalById(id);
		em.remove(animal);
	}

}
