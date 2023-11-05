package com.nt.sbeans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("voter")
@PropertySource("com/nt/commons/info.properties")
public class VotingEligibilityCheckService {
  @Value("${per.name}")
  private String name;
  @Value("${per.age}")
  private int age;
  @Value("${per.addrs}")
  private String addrs;
  private Date dov;
  
  

public void setName(String name) {
	System.out.println("VotingEligibilityCheckService.setName()");
	this.name = name;
}

public void setAge(int age) {
	System.out.println("VotingEligibilityCheckService.setAge()");
	this.age = age;
}

public void setAddrs(String addrs) {
	System.out.println("VotingEligibilityCheckService.setAddrs()");
	this.addrs = addrs;
}

//b.method
public String checkVotingEligibility() {
	
	System.out.println("VotingEligibilityCheckService.checkVotingEligibility()(Business method)");
    if(age>=18) {
    	return "Mr/Mrs/Miss"+name+", your are eligilble at this date"+dov;
    }
    else {
    	return "Mr/Miss/Mrs"+name+", you are not eligible to vote at this date"+dov;
    }
}
@PostConstruct
public void myInit() {
	System.out.println("VotingEligibilityCheckService.myInit()");
	dov= new Date();
	if(name== null || age<0 || addrs==null) {
		throw new IllegalArgumentException("invalid input");
	}
}
@PreDestroy
public void myDestroy() {
	System.out.println("VotingEligibilityCheckService.myDestroy()");
	name=null;
	age=0;
	addrs=null;
	dov=null;
}



  
}
