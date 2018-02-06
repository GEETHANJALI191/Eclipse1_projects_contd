package util;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import implementation.OrchardImplClass;

public class MainClass {

	public static void main(String[] args) {
			OrchardImplClass oi=new  OrchardImplClass();
			
			oi.InsertOrchard();
			

	}

}
