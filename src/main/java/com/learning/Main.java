package com.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.learning.config.HibernateConfig;
import com.learning.entity.Employee;

public class Main {

	public static void main(String[] args) {
		Employee e = new Employee("Anoop", "male", 60000);
		SessionFactory sf = HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(e);
		tx.commit();
		System.out.println("Main.main()");

	}

}
