package com.interfacevsabstract;

public class Student extends Pesron {

	String name;
	int age;
	int height;
	int weight;
	int rollno;
	int marks;
	public Student(String name, int age, int height, int weight, int rollno, int marks) {
		super(name, age, height, weight);
		System.out.println("op"+name+age+height+weight+rollno+marks);
		this.name = name;
		this.age=age;
		this.height = height;
		this.weight = weight;
		this.rollno = rollno;
		this.marks = marks;
		System.out.println("Student");
	}
	
@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", rollno="
				+ rollno + ", marks=" + marks + "]";
	}

public static void main(String[] args) {
	Student s=new Student("abc", 25, 6, 56, 1, 84);
	System.out.println(s);
}
}
