package com.tablePerClass;

import javax.persistence.Entity;

@Entity
public class Akurdisks extends Cjckkk {

	private String weekendbatch;

	public String getWeekendbatch() {
		return weekendbatch;
	}

	public void setWeekendbatch(String weekendbatch) {
		this.weekendbatch = weekendbatch;
	}

	@Override
	public String toString() {
		return "Akurdisk [weekendbatch=" + weekendbatch + "]";
	}
	
}
