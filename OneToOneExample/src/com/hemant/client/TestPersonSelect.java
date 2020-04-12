package com.hemant.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hemant.model.Person;
public class TestPersonSelect {

	public static void main(String[] args) {
		
		 Configuration config = new Configuration();
		 config.configure("hibernate.cfg.xml");
		 SessionFactory factory = config.buildSessionFactory();
		 Session session = factory.openSession();
		 Person p = (Person)session.get(Person.class,1);
		 System.out.println(p);
		 session.close();
		 factory.close();
		 

	}

}
