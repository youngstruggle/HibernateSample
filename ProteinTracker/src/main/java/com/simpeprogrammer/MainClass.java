package com.simpeprogrammer;

import org.hibernate.Session;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Session session = HibernateUtilities.getSessionFactory().openSession();
		session.close();
	}
}
