package com.manytoone;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CustomerOrder {
	@Id
	private int cid;
	private String pname;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="co_id")
	Customer cst;
	public Customer getCst() {
		return cst;
	}
	public void setCst(Customer cst) {
		this.cst = cst;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "CustomerOrder [cid=" + cid + ", pname=" + pname + ", cst=" + cst + "]";
	}

}
