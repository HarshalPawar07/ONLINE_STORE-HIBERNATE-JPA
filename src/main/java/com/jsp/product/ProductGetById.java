package com.jsp.product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProductGetById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=
				Persistence.createEntityManagerFactory("harshal");
		
		EntityManager entityManager=
				entityManagerFactory.createEntityManager();
		
		Product product=entityManager.find(Product.class, 1);
		
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
	}

}
