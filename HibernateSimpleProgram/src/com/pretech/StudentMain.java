package com.pretech;

import org.hibernate.*;

import org.hibernate.cfg.*;

public class StudentMain {

	private static SessionFactory sessionFactory;

	public static void main(String args[]) throws Exception {

		try {

			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Student student = new Student();

		student.setName("Vinod");

		student.setStandard("10th Standard");

		session.save(student);

		tx.commit();

		System.out.println("Updated to Student details table");

		if (session != null)

			session.close();

	}

}