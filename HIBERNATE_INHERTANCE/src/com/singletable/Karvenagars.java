package com.singletable;

import javax.persistence.Entity;

@Entity
public class Karvenagars extends Cjck {

	private String regularbatch;

	public String getRegularbatch() {
		return regularbatch;
	}

	public void setRegularbatch(String regularbatch) {
		this.regularbatch = regularbatch;
	}

	@Override
	public String toString() {
		return "Karvenagar [regularbatch=" + regularbatch + "]";
	}
	
}
