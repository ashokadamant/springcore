package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("DTDC")
@Lazy(true)
@Scope("singleton")

public class DTDC implements Courier {
    public DTDC() {
    	System.out.println("DTDC.DTDC()");
    }
	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return oid+"orderid order products are given for DTDC service";
	}

}
