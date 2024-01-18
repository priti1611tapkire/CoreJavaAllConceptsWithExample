package com.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {
@Id
private int id;
private String name;
private String address;
@OneToMany(cascade=CascadeType.ALL)
private List<PersonBills> personbills;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public List<PersonBills> getPersonbills() {
	return personbills;
}
public void setPersonbills(List<PersonBills> personbills) {
	this.personbills = personbills;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", address=" + address + ", personbills=" + personbills + "]";
}
}

