package com.onetomany_uni;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerOrder {
	@Id
	private int coid;
	private String productName;
	public int getCoid() {
		return coid;
	}
	public void setCoid(int coid) {
		this.coid = coid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "CustomerOrder [coid=" + coid + ", productName=" + productName + "]";
	}

}
