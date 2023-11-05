package com.nt.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
			       "src\\com\\nt\\cfgs\\applicationContext.xml");
		
		/*ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
				*/
		 WishMessageGenerator generator=(WishMessageGenerator)ctx.getBean("wmg");
		 generator.wishMessage(" ashok");
		 ctx.close();
		 
  
       
	}

}
