package com.catalyst.zooKeepr.daos.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.catalyst.zooKeepr.daos.FoodDao;
import com.catalyst.zooKeepr.entities.Enclosure;
import com.catalyst.zooKeepr.entities.Food;

@Repository
@Transactional
public class FoodDaoHibernate implements FoodDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void setEM(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<Food> getFood() {
		return em.createQuery("SELECT f FROM Food f", Food.class).getResultList();
	}

	@Override
	public void add(Food food) {
		em.persist(food);
	}

	@Override
	public void update(Food food) {
		em.merge(food);
	}

	@Override
	public Food getFoodById(Integer id) {
		return em.createQuery("SELECT f FROM Food f WHERE f.id = :id", Food.class)
				.setParameter("id", id).getSingleResult();
	}

}
