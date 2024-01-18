package com.ce1;

import java.util.ArrayList;
import java.util.List;

public class Test {
public static void main(String[] args) {
		
		
		List<String> l=new ArrayList<String>();
		l.add("Monday");
		l.add("Thuesday");
		l.add("Wensday");
		l.add("Thusday");
		l.add("Friday");
		l.add("Saturday");
		l.add("Sunday");
		if(l.contains("Sunday") && l.contains("Saturday")) {
			 
			throw new DayNotFound("Bank have a holidays.....!");	
			
		}
		else {
			System.out.println("today is halfday");
		}
	}


}
