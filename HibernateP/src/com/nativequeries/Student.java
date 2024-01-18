package com.nativequeries;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@SuppressWarnings("unused")
@Entity
//@NamedQueries({
//	@NamedQuery(name="selectAll" ,query="from Student"),
//	@NamedQuery(name="selectByrollno" ,query="from Student where rollno=:rno"),
//	@NamedQuery(name="updateByrollno" ,query="update Student set name=:name where rollno=:rno"),
//	@NamedQuery(name="deleteByrollno", query="delete from Student where rollno=:rno")
//})

@NamedNativeQueries({
	@NamedNativeQuery(name="selectAll" ,query=" select * from student", resultClass=Student.class)
})

public class Student {
@Id
private int rollno;
private String name;
private String address;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
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
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
}

}
