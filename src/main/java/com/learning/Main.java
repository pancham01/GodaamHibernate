package com.learning;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.learning.config.HibernateConfig;
import com.learning.entity.Address;
import com.learning.entity.Employee;

public class Main {

	public static void getEmps(Session session) {

		Employee employee = session.get(Employee.class, 1);
		System.out.println(employee);
		System.out.println(employee.getAddress());
	}

	public static void getAddress(Session session) {

		Address add = new Address();
		session.load(add, 1);
		
		System.out.println(add);
		System.out.println(add.getEmployee());
	}

	public static void save(Session session) {

		Address a1 = new Address("GZB", "UP");
		Employee e = new Employee();

		e.setName("Kunal");
		e.setSalary(34343);
		e.setGender("Male");
		e.setAddress(a1);

		a1.setEmployee(e);

		Transaction tx = session.beginTransaction();

		session.persist(e);
		session.persist(a1);
		tx.commit();

	}

	public static void main(String[] args) {

		Session session = HibernateConfig.getSessionFactory().openSession();
		save(session);
//		getEmps(session);
//		getAddress(session);
		System.out.println("Saved.................");

	}

}
