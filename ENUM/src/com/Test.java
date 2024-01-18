package com;

public class Test {
	
	public void m1() {
		Days d=Days.SAT;
		System.out.println(d);
		if(d.name().equals("SAT")) {
			System.out.println("Today is Saturday");
		}
	}


	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
		Days d=Days.SAT;
		System.out.println(d);
		if(d.name().equals("SAT")) {
			System.out.println("Today is Saturday");
		}
		
         for(int i=0;i<d.color.length;i++) {
        	 System.out.println(d.color[i]);
        	 if(d.color[i].equals("RED")) {
        		 System.out.println("THIS IS DANGER");
        	 }
         }
         System.out.println("----------------------------------");
         for(String c:d.color) {
        	 System.out.println(c);
         }
		System.out.println("================================");
		Student s=new Student();
		if(d.name().equals("SAT") && d==Days.SUN) {
			System.out.println("Holidays Enjoy Student");
		}
		else {
			System.out.println("No Holidays");
			s.setFrom(Days.MON.name());
			s.setTo(Days.FRI.name());
		}
		System.out.println(s);
	}
}
