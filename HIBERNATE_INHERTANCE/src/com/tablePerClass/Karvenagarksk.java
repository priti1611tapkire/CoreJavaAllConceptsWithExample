package com.tablePerClass;

import javax.persistence.Entity;

@Entity
public class Karvenagarksk extends Cjckkk{

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
