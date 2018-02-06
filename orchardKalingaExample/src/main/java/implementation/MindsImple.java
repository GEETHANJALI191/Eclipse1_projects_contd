package implementation;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Daointerface.campus_minds;
import orchardonetomanyprog.LeadPojo;
import orchardonetomanyprog.MindsPojo;

public class MindsImple implements campus_minds{
	public void InsertCampusMinds(LeadPojo l){
		SessionFactory sessionfactory=new Configuration().configure("/util/hibernate.cfg.xml").buildSessionFactory();
		Scanner scan =new Scanner(System.in);
		try{
			Session session=sessionfactory.openSession();
			session.beginTransaction();
			
			MindsPojo m=new MindsPojo();
			
			System.out.println("enter minds mid");
			int m1=scan.nextInt();
			m.setMid(m1);
			
			System.out.println("enter minds name");
			String m2=scan.next();
			m.setName(m2);
			
			m.setL(l);
			session.save(m);
			
			session.getTransaction().commit();
			session.close();
			sessionfactory.close();
			}
		catch(HibernateException e){
			e.printStackTrace();
		}
	}

}
