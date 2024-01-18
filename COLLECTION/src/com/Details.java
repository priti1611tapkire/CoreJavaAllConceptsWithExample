package com;

import java.util.*;

public class Details {
	public List setdetails(){ 		
		List l=new ArrayList();        		
		//set employee data here and add it into list.        	
		Employee e=new Employee(); 
		e.setEmpid(11);
		e.setEmpname("PRIT");
		e.setEmpdesig("MANAGER");
		e.setEmpsalary(50000d);
		
		Employee e1=new Employee(); 
		e1.setEmpid(22);
		e1.setEmpname("DEEPA");
		e1.setEmpdesig("ENGINEER");
		e1.setEmpsalary(60000d);
		l.add(e);
		l.add(e1);
		return l;	
	} 
	public void getdetails(List l1){        		
		//get employee data here using iterator.   

		Iterator itr=l1.iterator();
		while(itr.hasNext()){
			Employee e2=(Employee)itr.next();
			System.out.println(e2.getEmpid());
			System.out.println(e2.getEmpname());
			System.out.println(e2.getEmpdesig());
			System.out.println(e2.getEmpsalary());
		}
	} 

}
