package org.student;

public class MainMultilevelInheritance {
	/*
	 * 1. Creating Oject for Student Class(GrandChild class)
	 * 2. Calling all the methods from GrandParent class College,
	 *    Parent Class Parent and own class student
	 */

	public static void main(String[] args) {
		Student studentObj=new Student();
		studentObj.collegeName();
		studentObj.collegeCode();
		studentObj.collegeRank();
		studentObj.deptName();
		studentObj.studentName();
		studentObj.studentId();
		studentObj.studentDept();

	}

}
