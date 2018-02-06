package com.student;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		
		//Configuration con=new Configuration();
		//con.configure("hibernate.cfg.xml");                                              //.configure().addAnnotatedClass(CampusMinds.class);
		//ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		//SessionFactory sf=con.buildSessionFactory();
		//Session session = new Configuration.buildSessionFactory().openSession();
		
		
		
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");                                             
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction = null;

		
		try {
			transaction = session.beginTransaction();
			
			Set<Phone> phoneNumbers = new HashSet<Phone>();
			phoneNumbers.add(new Phone("house","32354353"));
			phoneNumbers.add(new Phone("mobile","9889343423"));
			
			Student student = new Student("Eswar", phoneNumbers);
			session.save(student);
			
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}
}


