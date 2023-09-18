package com.jsp.product;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ProductGetAll {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("harshal");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT e FROM Product e";
		Query query = entityManager.createQuery(sql);
		List<Product> products = query.getResultList();
		for (Product p : products) {
			System.out.println("============================");
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getPrice());
		}

	}

}
