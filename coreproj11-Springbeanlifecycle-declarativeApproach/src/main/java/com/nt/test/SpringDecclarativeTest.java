package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.VotingEligibilityCheckService;

public class SpringDecclarativeTest {

	public static void main(String[] args) {
		System.out.println("SpringDecclarativeTest.main()");
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext  ctx= new ClassPathXmlApplicationContext(
        		"com/nt/cfgs/applicationContext.xml");
		System.out.println("SpringDecclarativeTest.main()");
		
		VotingEligibilityCheckService voter= ctx.getBean("voter",VotingEligibilityCheckService.class);
		String result=voter.checkVotingEligibility();
		System.out.println(result);
		ctx.close();
	}

}
