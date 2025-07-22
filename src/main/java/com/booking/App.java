package com.booking;

import java.util.Scanner;

import com.booking.repository.CourseRepo;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		CourseRepo course = new CourseRepo();

		System.out.println("press 1 Register for course");
		Scanner sc = new Scanner(System.in);
		int opration = sc.nextInt();

		switch (opration) {
		case 1:
			course.addCourse();
			break;

		}
	}
}
