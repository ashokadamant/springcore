package com.nt.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dhl")
@Scope("singleton")

public class DHL implements Courier{
    public DHL() {
    	System.out.println("DHL.DHL()");
    }
	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		
		return oid+"orderid order products are given for DHL service";
	}

}
