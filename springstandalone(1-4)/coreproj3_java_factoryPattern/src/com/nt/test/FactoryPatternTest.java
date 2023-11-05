package com.nt.test;

import com.nt.comps.Person;
import com.nt.factory.PersonFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Person per=PersonFactory.getPerson("stud");
      per.doTask();
      
      Person per1=PersonFactory.getPerson("Cust");
      per1.doTask();
      Person per2= PersonFactory.getPerson("Emp");
      per2.doTask();
      
      
      
	}

}
