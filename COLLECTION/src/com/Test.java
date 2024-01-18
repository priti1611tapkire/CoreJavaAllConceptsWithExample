package com;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String args[]){       
		//set (Using scanner and list) and get (Using iterator)your data here        		
		Student s=new Student();  
		s.setRollno(11);
		s.setName("ABC");
		s.setAddr("ABAD");
		Student s1=new Student();  
		s1.setRollno(22);
		s1.setName("PQR");
		s1.setAddr("PUNE");
		
		Student s2=new Student() ;
		s2.setRollno(33);
		s2.setName("MNO");
		s2.setAddr("JALNA");
		
		List<Student> stu=new ArrayList<>();
		stu.add(s);
		stu.add(s1);
		stu.add(s2);
		for(Student stu1:stu){
			System.out.println(stu1.getRollno());
			System.out.println(stu1.getName());
			System.out.println(stu1.getAddr());
		}
	} 
}


