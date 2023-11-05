package com.nt.test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class A {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ashok";
		System.out.println(s1.getClass());
      Class c= String.class;
      Class c1= ArrayList.class;
      System.out.println(c);
      System.out.println(c.toString());
      System.out.println(c1.toString());
      System.out.println(c.getClass());
      System.out.println(c.getName());
		/* Method[] methods = c.getDeclaredMethods();
		 for (Method m1: methods) {
		  System.out.println(m1.getName());
		 }*/
	}

}
