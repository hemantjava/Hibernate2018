package com.hemant.client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.hemant.model.Person;
import com.hemant.model.PersonDetails;

public class TestPersonInsert {

	public static void main(String[] args) {
		
		 Configuration config = new Configuration();
		 config.configure("hibernate.cfg.xml");
		 SessionFactory factory = config.buildSessionFactory();
		 Session session = factory.openSession();
		 Person p = new Person();
		 p.setPersonName("hemant");
		 
		 PersonDetails pd = new PersonDetails();
		 pd.setIncome(1233.44);
		 pd.setJob("developer");
		 pd.setZipCode("497449");
		 
		 p.setPersonDetails(pd);
		 
		 Transaction tx = session.beginTransaction();
		 session.saveOrUpdate(p);
		 tx.commit();
		 session.close();
		 factory.close();
		 

	}

}
