package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("voter")
@PropertySource("com/nt/commons/info.properties")
public class VotingEligibilityCheckService implements InitializingBean, DisposableBean {
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

/*public void myInit() {
	System.out.println("VotingEligibilityCheckService.myInit()");
	dov= new Date();
	if(name== null || age<0 || addrs==null) {
		throw new IllegalArgumentException("invalid input");
	}
}*/
/*public void myDestroy() {
	System.out.println("VotingEligibilityCheckService.myDestroy()");
	name=null;
	age=0;
	addrs=null;
	dov=null;
}*/

@Override
public void destroy() throws Exception {
System.out.println("VotingEligibilityCheckService.destroy()");
	// TODO Auto-generated method stub
	name=null;
	age=0;
	addrs=null;
	dov=null;

}

@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("VotingEligibilityCheckService.afterPropertiesSet()");
	// TODO Auto-generated method stub
	dov= new Date();
	if(name== null || age<0 || addrs==null) {
		throw new IllegalArgumentException("invalid input");
	}
}



  
}
