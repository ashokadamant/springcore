package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class AutowiringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ClassPathXmlApplicationContext ctx=  new ClassPathXmlApplicationContext(
    		 "com/nt/cfgs/applicationContext.xml");
    //SeasonFinder finder =(SeasonFinder)ctx.getBean("sf"); without generics
   SeasonFinder finder=ctx.getBean("sf",SeasonFinder.class);// with generics
   String result=finder.findSeason(" ashok");
   System.out.println(result);
	}

}
