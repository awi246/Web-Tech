package com.hibernatedemo.serviceimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernatedemo.model.College;
import com.hibernatedemo.service.CollegeService;
import com.hibernatedemo.util.SessionFactoryUtil;

public class CollegeServiceImpl implements CollegeService {
		
	SessionFactory sessionFactory;
	
	public CollegeServiceImpl() {
		
		sessionFactory = SessionFactoryUtil.getSessionFacotroy();
		
	}
	

	public int addCollege(College college) {
		
		Session session =  sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(college);
		transaction.commit();
		session.close();
		return 1;
		
	}

	public int updateCollege(College college) {
		
		Session session =  sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(college);
		transaction.commit();
		session.close();
		return 1;
		
	}


	public int deleteCollege(int id) {
		Session session =  sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		College college = session.load(College.class, id);
		session.delete(college);
		transaction.commit();
		session.close();
		return 1;
	}


	public College getCollege(int id) {
		
		Session session =  sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		College college = session.get(College.class, id);
		transaction.commit();
		session.close();
		return college;
	}


	public List<College> getColleges() {
	
		return null;
	}
	

}
