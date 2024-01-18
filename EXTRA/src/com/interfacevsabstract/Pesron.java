package com.interfacevsabstract;

public abstract class Pesron {

	String name;
	int age;
	int height;
	int weight;
	public Pesron(String name, int age, int height, int weight) {
		super();
		System.out.println("op------------"+name+age+height+weight);
		this.name = name;
		this.age = age; //84
		this.height = height; 
		this.weight = weight;
		System.out.println("PERSON");
	}
	
	@Override
	public String toString() {
		return "Pesron [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
}
