package com.bydafault;

import javax.persistence.Entity;

@Entity
public class Akurdim extends Cjcm {

	private String weekendbatch;

	public String getWeekendbatch() {
		return weekendbatch;
	}

	public void setWeekendbatch(String weekendbatch) {
		this.weekendbatch = weekendbatch;
	}

	@Override
	public String toString() {
		return "Akurdi [weekendbatch=" + weekendbatch + "]";
	}
	
}
