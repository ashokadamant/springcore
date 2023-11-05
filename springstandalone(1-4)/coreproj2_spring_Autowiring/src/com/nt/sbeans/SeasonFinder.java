package com.nt.sbeans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
@Autowired
  private Calendar cal;
  
public String findSeason(String user) {
	int month = cal.get(Calendar.MONTH);
	if(month>=2 && month <=5) {
		return "welcome to the summer season"+user;
	}
	else if(month >=6 && month <=9) {
		return "welcome to the rainy season" + user;
	}
	else {
		return "welcome to the winter season"+user;
	}
}
}
