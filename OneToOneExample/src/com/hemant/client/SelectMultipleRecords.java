package com.hemant.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hemant.model.Person;

public class SelectMultipleRecords {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Query query = session.createQuery("from Person");

		 List list = query.list();
		for (Object object : list) {
			Person person = (Person) object;

			System.out.println(person);
		}
		System.out.println("========================selected id ================================");
		Person person = (Person) session.createQuery("from Person where id = 25").list().get(0);
		System.out.println(person);
		session.close();
		factory.close();

	}

}
