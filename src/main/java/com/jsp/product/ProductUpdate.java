package com.jsp.product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProductUpdate {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("harshal");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Product product = entityManager.find(Product.class, 3);
		product.setPrice(2500);

		entityTransaction.begin();
		entityManager.merge(product);
		entityTransaction.commit();

	}

}
