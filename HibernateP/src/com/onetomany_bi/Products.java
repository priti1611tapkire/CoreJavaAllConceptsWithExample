package com.onetomany_bi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Products {
	@Id
	private int pid;
	private String pname;
	private double prise;
	@ManyToOne(cascade=CascadeType.ALL)
	private Customers clist;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrise() {
		return prise;
	}
	public void setPrise(double prise) {
		this.prise = prise;
	}
	
	public Customers getClist() {
		return clist;
	}
	public void setClist(Customers clist) {
		this.clist = clist;
	}
	@Override
	public String toString() {
		return "Products [pid=" + pid + ", pname=" + pname + ", prise=" + prise + ", clist=" + clist + "]";
	}

}
