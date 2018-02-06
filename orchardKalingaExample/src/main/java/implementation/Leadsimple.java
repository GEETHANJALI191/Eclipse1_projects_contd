package implementation;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Daointerface.leads;
import orchardonetomanyprog.LeadPojo;
import orchardonetomanyprog.OrchardPojo;

public class Leadsimple implements leads{
	public void InsertLeads(OrchardPojo o){
		SessionFactory sessionfactory=new Configuration().configure("/util/hibernate.cfg.xml").buildSessionFactory();
		Scanner scan =new Scanner(System.in);
		try{
			Session session=sessionfactory.openSession();
			session.beginTransaction();
			int i=0;
			
			LeadPojo l=new LeadPojo();
			
			System.out.println("enter lead mid");
			int a=scan.nextInt();
			l.setLmid(a);
			
			System.out.println("enter lead name");
			String b=scan.next();
			l.setName(b);
			
			l.setO(o);
			session.save(l);
			
			while(i<2){
				MindsImple m=new MindsImple();
				m.InsertCampusMinds(l);
				i++;
			}
			
			session.getTransaction().commit();
			session.close();
			sessionfactory.close();
			}
		catch(HibernateException e){
			e.printStackTrace();
		}
	}


	
}
