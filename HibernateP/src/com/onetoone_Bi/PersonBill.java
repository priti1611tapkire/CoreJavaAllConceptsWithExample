package com.onetoone_Bi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

public class PersonBill {

	@Id
	private int billid;
	private int meterId;
	private double mobBill;
	private double homeRent;
	
	@OneToOne(cascade=CascadeType.ALL)
	private PersonP personp;
	public PersonP getPersonp() {
		return personp;
	}
	public void setPersonp(PersonP personp) {
		this.personp = personp;
	}
	public int getBillid() {
		return billid;
	}
	public void setBillid(int billid) {
		this.billid = billid;
	}
	public int getMeterId() {
		return meterId;
	}
	public void setMeterId(int meterId) {
		this.meterId = meterId;
	}
	public double getMobBill() {
		return mobBill;
	}
	public void setMobBill(double mobBill) {
		this.mobBill = mobBill;
	}
	public double getHomeRent() {
		return homeRent;
	}
	public void setHomeRent(double homeRent) {
		this.homeRent = homeRent;
	}
	@Override
	public String toString() {
		return "PersonBill [billid=" + billid + ", meterId=" + meterId + ", mobBill=" + mobBill + ", homeRent="
				+ homeRent + ", personp=" + personp + "]";
	}
	
}
