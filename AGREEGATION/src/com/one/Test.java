package com.one;

public class Test {
	public static void main(String[] args) {
		Address a=new Address();
		a.setCity("ABAD");
		a.setState("MH");
		a.setCountry("INDIA");
		
		Employee e=new Employee();
		e.setId(1);
		e.setName("PRITI");
		e.setAddress(a);
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getAddress().getCity());
		System.out.println(e.getAddress().getState());
		System.out.println(e.getAddress().getCountry());
		System.out.println(a.getCity());
		System.out.println(a.getState());
		System.out.println(a.getCountry());
	}
}
