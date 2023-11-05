package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("bdart")
@Lazy(true)
public class BlueDart implements Courier{
   
	public BlueDart() {
		System.out.println("BlueDart.BlueDart()");
	}
	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return oid+"orderid order produts are given for bluedart service";
	}

}
