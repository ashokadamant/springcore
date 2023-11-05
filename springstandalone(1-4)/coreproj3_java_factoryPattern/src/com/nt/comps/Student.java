package com.nt.comps;

public class Student implements  Person{
public Student() {
	System.out.println();
	System.out.println("Student.Student()");
}

@Override
public void doTask() {
	// TODO Auto-generated method stub
	System.out.println("students are studying enginnering");
}
}
