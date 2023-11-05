package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DHL;
import com.nt.comps.DTDC;
import com.nt.comps.FirstFlight;

public class CourierFactory {
  
	public static  Courier setCourier(String type) {
		   Courier cr= null;
		   if(type.equalsIgnoreCase("DTDC")) {
			   cr= new DTDC();
		   }
		   else if(type.equalsIgnoreCase("BlueDart")) {
			   cr=new BlueDart();
		   }
		   else if(type.equalsIgnoreCase("DHL")) {
			   cr=new DHL();
		   }
		   else if(type.equalsIgnoreCase("FirstFlight")) {
			 cr=new FirstFlight();
		   }
		   else {
			   System.out.println("invalid option");
		   }
		   return cr;
	   }
	   
   
}
