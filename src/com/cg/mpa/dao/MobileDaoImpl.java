package com.cg.mpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.mpa.entities.Mobile;

@Repository
public class MobileDaoImpl implements MobileDao {
	@PersistenceContext
	private EntityManager em;
	@Override
	public List<Mobile> fetchAllMobiles() {
		String jpql = "SELECT m FROM Mobile m";
		TypedQuery<Mobile> query = em.createQuery(jpql, Mobile.class);
		return query.getResultList();
	}
}
