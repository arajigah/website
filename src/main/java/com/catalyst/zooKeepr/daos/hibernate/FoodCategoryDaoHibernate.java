package com.catalyst.zooKeepr.daos.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.catalyst.zooKeepr.daos.FoodCategoryDao;
import com.catalyst.zooKeepr.entities.FoodCategory;

@Repository
@Transactional
public class FoodCategoryDaoHibernate implements FoodCategoryDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void setEM(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<FoodCategory> getAllFoodCategories() {
		return em.createQuery("SELECT c FROM FoodCategory c", FoodCategory.class).getResultList();
	}

	@Override
	public void add(FoodCategory foodCategory) {
		em.persist(foodCategory);
	}

	@Override
	public FoodCategory getFoodCategoryById(Integer id) {
		return em.createQuery("SELECT c FROM FoodCategory c WHERE c.id = :id", FoodCategory.class)
				.setParameter("id", id).getSingleResult();
	}

}
