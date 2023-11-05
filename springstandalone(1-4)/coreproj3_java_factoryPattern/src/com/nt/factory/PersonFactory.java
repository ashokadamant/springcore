package com.nt.factory;

import com.nt.comps.Customer;
import com.nt.comps.Employee;
import com.nt.comps.Person;
import com.nt.comps.Student;

public class PersonFactory {
    public static  Person getPerson(String type) {
    	Person per= null;
    	if(type.equalsIgnoreCase("Stud")) {
    		per=(Person)new Student();
    	}
    	else if(type.equalsIgnoreCase("Cust")) {
    		per=new Customer();
    	}
    	else if(type.equalsIgnoreCase("Emp")) {
    		per=new Employee();
    	}
    	else
    		throw new IllegalArgumentException("invalid type");
    	
		return per;
    	
    }
}
