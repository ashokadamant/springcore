package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("fpkt")

@Component
//@Scope("singleton")
@Scope("prototype")
@PropertySource("com/nt/commons/courier.properties")
public class Flipkart {
	/*@Autowired
	@Qualifier("dhl")*/
	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart.Flipkart()");
	}

	/*@Autowired
	@Qualifier("dhl")*/
	/*public void setCourier(@Qualifier("dhl")Courier courier) {
		  this.courier=courier; 
		  }*/
	@Autowired
	public Flipkart(@Qualifier("supplier")Courier courier) {
		System.out.println("Flipkart.Flipkart()");
		this.courier=courier;
	}

	public String shopping(String[] items, double[] prices) {
		double billAmount = 0.0;
		for (double price : prices) {
			billAmount = billAmount + price;
		}
		int oid = new Random().nextInt(10000);
		String deliverymsg = courier.deliver(oid);

		return Arrays.toString(items) + "are purchased having billAmt" + billAmount + "and" + deliverymsg;
	}

}
