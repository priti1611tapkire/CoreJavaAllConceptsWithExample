package com.criteriabuilder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {
@Id
private int id;
private String name;
private int age;
private String addr;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
}

}
