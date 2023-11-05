package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("per")
@PropertySource("com/nt/commons/info.properties")
public class PersonInfo {
@Value("${per.name}")
 private String pname;
@Value("${per.addrs}")
 private String paddrs;
@Value("${per.age}")
 private int page;

public String toString() {
	return "Personinfo={"+pname+" "+paddrs+" "+page+" }";
}

}
