package com.simpeprogrammer;

import org.hibernate.Session;

public class MainClass {
	public static void main(String[] args) {
		try {
			System.out.println("Hello World");
			Session session = HibernateUtilities.getSessionFactory().openSession();
			session.beginTransaction();

			User user = new User();
			user.setId(1);
			user.setName("Joe");
			user.setTotal(29);
			user.setGoal(250);
			session.save(user);

			session.getTransaction().commit();
			session.close();
			HibernateUtilities.getSessionFactory().close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
