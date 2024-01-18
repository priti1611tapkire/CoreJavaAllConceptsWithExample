 package com.manytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.sun.xml.bind.v2.runtime.Name;

@Entity
public class Customer {
	@Id
	private int id;
	private String name;
	private String address;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="cst")
	 List<CustomerOrder> corder=new ArrayList<CustomerOrder>();
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
	public List<CustomerOrder> getCorder() {
		return corder;
	}
	public void setCorder(List<CustomerOrder> corder) {
		this.corder = corder;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", corder=" + corder + "]";
	}
	
	
	
}
