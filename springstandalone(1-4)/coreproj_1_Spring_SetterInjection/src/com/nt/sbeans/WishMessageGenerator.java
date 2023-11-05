package com.nt.sbeans;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
//@Autowired
 private LocalDateTime ldt;
 
 /*@Autowired
 public void setLdt(LocalDateTime ldt) {
	 this.ldt=ldt;
 }*/
 public WishMessageGenerator() {
		System.out.println("0 param constructor");
	}

@Autowired
public WishMessageGenerator(@Qualifier("SysDt1")LocalDateTime ldt) {
	System.out.println("WishMessageGenerator.WishMessageGenerator()");
	
    this.ldt=ldt;
    System.out.println(ldt);
}
@Autowired
public void assign(@Qualifier("SysDt")LocalDateTime ldt) {
	System.out.println("WishMessageGenerator.assign()");
	this.ldt=ldt;
	System.out.println(ldt);
	this.wishMessage(" gemini");
	
	
}



 public  void wishMessage(String user) {
	 int hour=ldt.getHour();
	 if(hour<12) {
		 System.out.println("goodmorning"+user);
	 }
	 else if( hour<16){
		 System.out.println("goodafternoon"+user);
	 }
	 else if(hour<20) {
		 System.out.println("goodevening"+user);
	 }
	 else{
		 System.out.println("goodnight"+user);
	 }
 }
 

}
