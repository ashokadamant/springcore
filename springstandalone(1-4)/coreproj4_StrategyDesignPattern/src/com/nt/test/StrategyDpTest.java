package com.nt.test;

import com.nt.comps.Courier;
import com.nt.comps.Flipkart;
import com.nt.factory.CourierFactory;

public class StrategyDpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Courier cr=CourierFactory.setCourier("Dhl");
      Flipkart fpkt= new Flipkart();
     fpkt.setCourier(cr);
    String msg=  fpkt.shopping(new String[] {"shirt","pant","trousers"},new double[] {300.0,355.0,232.0});
    	  
      System.out.println(msg);
      
      
	}

}
