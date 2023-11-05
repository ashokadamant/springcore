package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wmg")
public class WishMessageGenerator {
  @Autowired
  private LocalDateTime ldt;
  
  public WishMessageGenerator() {
	  System.out.println("WishMessageGenerator.WishMessageGenerator()");
  }
  
 public String WishMessage(String user) {
	 System.out.println("WishMessageGenerator.WishMessage()");
	 int hour=ldt.getHour();
	 if(hour<12) {
		 return "good morning "+user;
	 }
	 else if(hour<16) {
		 return "good afternoon "+user;
	 }
	 else if(hour<20) {
		 return "good evening "+user;
	 }
	 else {
		 return "good night "+user;
	 }
 }
}
