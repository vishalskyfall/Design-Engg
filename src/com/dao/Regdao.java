package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Regvo.Registervo;
import Regvo.hod_loginvo;
import Regvo.stud_loginvo;

public class Regdao {
	
	public List search(stud_loginvo regVo)
	{
		List ls = null;
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			session.save(regVo);
			
			transaction.commit();
			 
			session.close();
		}
		catch(Exception e) {e.printStackTrace();}
		return ls;
	}

	public List search(Registervo regVo)
	{
		List ls = null;
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			session.save(regVo);
			
			transaction.commit();
			 
			session.close();
		}
		catch(Exception e) {e.printStackTrace();}
		return ls;
	}
	public void insert(Registervo regVO)
	{
		try
			{
				SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
				
				Session session=sessionFactory.openSession();
				
				Transaction transaction=session.beginTransaction();
				
				session.save(regVO);
				
				transaction.commit();
				 
				session.close();
			}
		catch(Exception ex)
			{
				ex.printStackTrace();
			}
	}
	public void insert(hod_loginvo regVO)
	{
		try
			{
				SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
				
				Session session=sessionFactory.openSession();
				
				Transaction transaction=session.beginTransaction();
				
				session.save(regVO);
				
				transaction.commit();
				 
				session.close();
			}
		catch(Exception ex)
			{
				ex.printStackTrace();
			}
	}

}
