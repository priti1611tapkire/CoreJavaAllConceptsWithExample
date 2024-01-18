package com.singletable;

import javax.persistence.Entity;

@Entity
public class Akurdis extends Cjck {

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
