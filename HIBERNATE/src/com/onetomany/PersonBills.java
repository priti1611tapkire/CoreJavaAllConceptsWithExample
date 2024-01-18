package com.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PersonBills {
	@Id
	private int pbid;
	public int getPbid() {
		return pbid;
	}

	public void setPbid(int pbid) {
		this.pbid = pbid;
	}

	private String mobbill;
	
	private String electricitybill;
	
	private String waterbill;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getMobbill() {
		return mobbill;
	}

	public void setMobbill(String mobbill) {
		this.mobbill = mobbill;
	}

	public String getElectricitybill() {
		return electricitybill;
	}

	public void setElectricitybill(String electricitybill) {
		this.electricitybill = electricitybill;
	}

	public String getWaterbill() {
		return waterbill;
	}

	public void setWaterbill(String waterbill) {
		this.waterbill = waterbill;
	}

	@Override
	public String toString() {
		return "PersonBills [pbid=" + pbid + ", mobbill=" + mobbill + ", electricitybill=" + electricitybill
				+ ", waterbill=" + waterbill + ", person=" + person + "]";
	}

}
