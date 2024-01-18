package com.ex;

public class Test {

	public static void main(String[] args) {
		
				Karvenagar k=new Karvenagar();
				k.setRollno(1);
				k.setSname("ABC");
				k.setCourse("java");
				k.setWeekendbatch("B125");
				
				
				
				Akurdi akd=new Akurdi();
				akd.setRollno(2);
				akd.setSname("PQR");
				akd.setCourse("PYTHON");
				akd.setRegularbatch("B124");
				
				
				System.out.println(k.getRollno());
				System.out.println(k.getSname());
				System.out.println(k.getCourse());
				System.out.println(k.getWeekendbatch());
				System.out.println(akd.getRollno());
				System.out.println(akd.getSname());
				System.out.println(akd.getCourse());
				System.out.println(akd.getRegularbatch());
	}
}
