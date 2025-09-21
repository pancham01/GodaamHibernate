package com.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.learning.entity.Employee;

public class Main {

	public static SessionFactory getSessionFactory() {
		return new MetadataSources(new StandardServiceRegistryBuilder().configure("hibernate.cfg1.xml").build())
				.getMetadataBuilder().build().buildSessionFactory();
	}

	public static void main(String[] args) {

		Employee e = new Employee("Chandra", "male", 50000);
//		1st
//		Configuration cfg = new Configuration().configure("hibernate.cfg1.xml");

//		2nd
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg1.xml").build();
//		Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory sessionFactory = metadata.buildSessionFactory();
		
		SessionFactory sf = getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(e);
		tx.commit();
		System.out.println("Main.main()");

	}

}
