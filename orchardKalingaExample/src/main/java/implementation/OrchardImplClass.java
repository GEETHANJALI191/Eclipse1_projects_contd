package implementation;

import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import Daointerface.orchards;
import orchardonetomanyprog.LeadPojo;
import orchardonetomanyprog.MindsPojo;
import orchardonetomanyprog.OrchardPojo;

public class OrchardImplClass implements orchards
{
	public void InsertOrchard()
	{
			SessionFactory sessionfactory=new Configuration().configure("/util/hibernate.cfg.xml").buildSessionFactory();
			Scanner scan =new Scanner(System.in);
			try{
				Session session=sessionfactory.openSession();
				session.beginTransaction();
				int i=0;
				
				LeadPojo l=new LeadPojo();
				MindsPojo m=new MindsPojo();
				OrchardPojo o=new OrchardPojo();
				
				System.out.println("enter trackid");
				int b1=scan.nextInt();
				o.setTrackid(b1);
				
				System.out.println("enter trackname");
				String b2=scan.next();
				o.setTrackName(b2);
				
				session.save(o);
				
				while(i<2){
					Leadsimple l1=new Leadsimple();
					l1.InsertLeads(o);
					i++;
				}
				
				List<MindsPojo> list1=null;
				Query query=(Query) session.createQuery("from MindsPojo");
				list1=query.list();
				
				for(MindsPojo arr:list1){
					System.out.println(arr.getMid()+" "+arr.getName()+" "+arr.getL());
					
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

