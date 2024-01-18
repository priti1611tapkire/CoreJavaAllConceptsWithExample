package com.onetoone_Bi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

public class PersonP {

	@Id
	private int id;
	
	private String name;
	private String address;
	
	@OneToOne(cascade=CascadeType.ALL)
	private PersonBill pancard;

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

	public PersonBill getPancard() {
		return pancard;
	}

	public void setPancard(PersonBill pancard) {
		this.pancard = pancard;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", pancard=" + pancard + "]";
	}
}
