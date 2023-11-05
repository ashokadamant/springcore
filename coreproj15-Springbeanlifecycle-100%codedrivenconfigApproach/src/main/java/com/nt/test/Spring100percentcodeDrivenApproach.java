package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class Spring100percentcodeDrivenApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Spring100percentcodeDrivenApproach.main()");
     AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext
    		 (AppConfig.class);
     System.out.println("Spring100percentcodeDrivenApproach.main()");
     WishMessageGenerator wmg= ctx.getBean("wmg",WishMessageGenerator.class);
    String result= wmg.WishMessage("ashok");
    System.out.println(result);
     ctx.close();
	}

}
