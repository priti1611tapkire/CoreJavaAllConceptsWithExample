package com;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Pancard {

	@Id
	private int panNo;
	private String panName;
	public int getPanNo() {
		return panNo;
	}
	public void setPanNo(int panNo) {
		this.panNo = panNo;
	}
	public String getPanName() {
		return panName;
	}
	public void setPanName(String panName) {
		this.panName = panName;
	}
	@Override
	public String toString() {
		return "Pancard [panNo=" + panNo + ", panName=" + panName + "]";
	}
}
