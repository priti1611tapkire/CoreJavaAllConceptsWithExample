package com.joinedtable;

import javax.persistence.Entity;

@Entity
public class Karvenagarks extends Cjckk{

	private String regularbatch;

	public String getRegularbatch() {
		return regularbatch;
	}

	public void setRegularbatch(String regularbatch) {
		this.regularbatch = regularbatch;
	}

	@Override
	public String toString() {
		return "Karvenagarks [regularbatch=" + regularbatch + "]";
	}
}
