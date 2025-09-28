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

//		Employee employee = new Employee();
//		session.load(employee, 4);
//		Employee employee2 = session.find(Employee.class, 1);
//		System.out.println(employee);
//		System.out.println(employee2);
		
//		Select all records
//		Query query = session.createQuery("from Employee",Employee.class);
//		List list = query.list();
//		System.out.println(list);
		
		
//		Query query = session.createQuery("from Employee",Employee.class);
//		query.setFirstResult(3);
//		query.setMaxResults(5);
//		List list = query.list();
//		System.out.println(list);
		
//		Query query = session.createQuery("update Employee set name = :n where id = :i");
//		query.setParameter("n", "Udit narayan");
//		query.setParameter("i", 9);
//		query.executeUpdate();
		
		
		
//		Query query = session.createQuery("delete from Employee where id = :i");
//		query.setParameter("i", 9);
//		query.executeUpdate();
		
		
//		Query query = session.createQuery("select  max(name) from Employee");
//		System.out.println(query.list());
	
		
//		Query namedQuery = session.createNamedQuery("findEmps");
//		List list = namedQuery.list();
//		
//		System.out.println(list);
//		tx.commit();
		System.out.println("Main.main()");

	}

}
