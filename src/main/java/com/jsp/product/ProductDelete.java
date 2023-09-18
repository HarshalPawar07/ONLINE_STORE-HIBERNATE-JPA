package com.jsp.product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class ProductDelete {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=
				Persistence.createEntityManagerFactory("harshal");
		
		EntityManager entityManager=
				entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=
				entityManager.getTransaction();

		Product product=entityManager.find(Product.class, 5);
		
		if(product!=null) {
			entityTransaction.begin();
			entityManager.remove(product);
			entityTransaction.commit();
		}else {
			System.out.println("Not Deleted");
		}
	}

}
