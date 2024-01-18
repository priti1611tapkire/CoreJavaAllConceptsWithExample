package com.practi;

import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;
@Entity
@DynamicUpdate
public class Employee {
@Id
private int id;
private String name;
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
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}

}
