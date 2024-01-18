package com.onetomany_uni;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	private int cid;
	private String name;
	private String address;

	@OneToMany(cascade=CascadeType.ALL)
	private List<CustomerOrder> corder;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
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
		return "Customer [cid=" + cid + ", name=" + name + ", address=" + address + ", corder=" + corder + "]";
	}

}
