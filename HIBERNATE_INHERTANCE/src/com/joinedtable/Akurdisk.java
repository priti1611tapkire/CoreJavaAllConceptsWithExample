package com.joinedtable;

import javax.persistence.Entity;

@Entity
public class Akurdisk extends Cjckk {

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
