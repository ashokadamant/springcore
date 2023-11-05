package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Flipkart;

public class StrategyDpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ClassPathXmlApplicationContext  ctx= new ClassPathXmlApplicationContext(
    		"com/nt/cfgs/applicationContext.xml");
		 Flipkart fpkt= ctx.getBean("fpkt",Flipkart.class);
		 String result=fpkt.shopping(new String[] {"shirts","trousers"}, new double[] {500.0,238.0});
		System.out.println(result);
		 ctx.close();
    		
	}

}
