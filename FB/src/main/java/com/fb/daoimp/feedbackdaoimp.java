package com.fb.daoimp;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.fb.dao.feedbackdao;
import com.fb.entity.staff;
import com.fb.entity.student;
import com.fb.entity.studentfeedbackentity;
import com.fb.util.HibernateUtility;

public class feedbackdaoimp implements feedbackdao {

	public String savefeedback(studentfeedbackentity studentfeedbackentity) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(studentfeedbackentity);
		t.commit();
		return "success";
	}

	public studentfeedbackentity getfeedback(int id) {
		Session session = com.fb.util.HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		studentfeedbackentity se = session.get(studentfeedbackentity.class,id);
		t.commit();
		return se;
	}
	public String savecreatestudent(student createstudentEntity) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(createstudentEntity);
		t.commit();
		return "success";
	}
	public student getcreatestudent(int rollno) {
		Session session = com.fb.util.HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		student se = session.get(student.class, rollno);
		t.commit();
		return se;
	}
	public String savestaff(staff  staffentity) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(staffentity);
		t.commit();
		return "success";
	}
	public staff getstaffentity(int id) {
		Session session = com.fb.util.HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		staff se = session.get(staff.class,id);
		t.commit();
		return se;
}}
