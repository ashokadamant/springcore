package com.nt.test;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringI18nTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext(
				"com/nt/cfgs/applicationContext.xml");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the language code");
		String languageCode=sc.next();
		System.out.println("enter the country code");
		String countryCode=sc.next();
		Locale locale= new Locale(languageCode,countryCode);
		
		String msg=ctx.getMessage("wish.message",new Object[] {},locale);
		System.out.println(msg);
		ctx.close();
	}

}
