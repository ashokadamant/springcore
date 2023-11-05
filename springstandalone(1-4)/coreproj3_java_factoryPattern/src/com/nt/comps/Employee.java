package com.nt.comps;

public class Employee  implements Person{

	public Employee(){
		System.out.println("Employee.Employee()");
	}
	@Override
	public void doTask() {
		// TODO Auto-generated method stub
		System.out.println("employee is doing a job");
	}

}
