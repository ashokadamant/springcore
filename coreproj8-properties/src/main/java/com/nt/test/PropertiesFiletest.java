package com.nt.test;

import java.util.Properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.PersonInfo;

public class PropertiesFiletest {

	public static void main(String[] args) {
		// TODO Auto-generated method 
ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext(
		"com/nt/cfgs/applicationContext.xml");
      PersonInfo info =ctx.getBean("per",PersonInfo.class);
      System.out.println(info);
      ctx.close();
	}

}
