package com.prowings.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prowings.entity.Student;
import com.prowings.util.HibernateUtil;

public class StudentDao {
	
	public Student saveStudent(Student s) {
		
		Session session = HibernateUtil.getSession();
		
//		Configuration cfg = new Configuration();
		
//		cfg.configure("hibernate.cfg.xml");
		
//		SessionFactory sf = cfg.buildSessionFactory();
		
//		Session session = sf.openSession();
		
		Transaction txn = session.beginTransaction();
		
		session.save(s);
		
		txn.commit();
		session.close();
		
		return s;
		
		
	}

}
