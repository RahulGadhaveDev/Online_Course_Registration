package com.booking.repository;

import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.booking.entity.Registration;
import com.booking.utility.CourseUtility;

public class CourseRepo {
	
	Scanner sc = new Scanner(System.in);

	public void addCourse() {
		Registration registration = new Registration();
		
		System.out.println("Enter your student name");
		String name= sc.next();
		registration.setStudentName(name);

		System.out.println("Enter your course name");
		String course = sc.next();
		registration.setCourseName(course);
		
		registration.setRegistrationDate(new java.sql.Date(System.currentTimeMillis()));
		
		System.out.println("Enter Fees paid ammount");
		double fee =sc.nextDouble();
		registration.setFeesPaid(fee);
		
		SessionFactory factory = CourseUtility.getfactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.persist(registration);
		
		transaction.commit();
		session.close();
		
		
	}

}
