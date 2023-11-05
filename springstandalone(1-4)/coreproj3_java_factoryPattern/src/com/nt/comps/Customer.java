package com.nt.comps;

import java.util.Random;

public class Customer implements Person{
	
  public Customer() {
	  System.out.println("Customer.Customer()");
  }

@Override
public void doTask() {
	// TODO Auto-generated method stub
	System.out.println("Student purchased items of price"+new Random().nextInt(10000));
}
  
}
