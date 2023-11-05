package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("firstflight")
@Lazy(true)
@Scope("singleton")

public class FirstFlight implements Courier {
    public FirstFlight() {
    	System.out.println("FirstFlight.FirstFlight()");
    }
	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return oid +"orderid order products are given for FirstFlight service";
	}

}
