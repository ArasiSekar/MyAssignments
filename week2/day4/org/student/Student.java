package org.student;

import org.department.Department;

public class Student extends Department{
	/*
	 * 1. Create Student class extends department
	 * 2. Create Method stud Name,Dept,ID
	 */
	
	public void studentName()
	{
		System.out.println("-----GrandChild Class Student Name method----");
		System.out.println("Student Name: Arasi");
	}
	public void studentDept()
	{
		System.out.println("-----GrandChild Class Student Dept method----");
		System.out.println("Student Department: CSE");
	}
	public void studentId()
	{
		System.out.println("-----GrandChild Class Student ID method----");
		System.out.println("Student Id: VT01200194321");
	}
}
