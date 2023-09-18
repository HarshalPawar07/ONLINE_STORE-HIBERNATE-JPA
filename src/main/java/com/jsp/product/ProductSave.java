package com.jsp.product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProductSave {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =
				Persistence.createEntityManagerFactory("harshal");

		EntityManager entityManager = 
				entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = 
				entityManager.getTransaction();
		
		Product product= new Product();
		product.setName("Earphones");
		product.setPrice(550);
		
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();

	}

}
