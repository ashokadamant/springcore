package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
  private Courier courier;
  
   public void setCourier(Courier courier) {
	   this.courier=courier;
   }
   
    
	public String shopping(String[] items, double[] prices) {
		double billAmount=0.0;
		for(double price: prices) {
			billAmount=billAmount+price;
		}
		int oid= new Random().nextInt(10000);
	    String deliverymsg=courier.deliver(oid);
	    
	    return Arrays.toString(items)+"are purchased having billAmt"+billAmount+"and"+deliverymsg;
	}


	
	 
	
	
	
}
