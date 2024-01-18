package com.bydafault;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Karvenagarm extends Cjcm {

	
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
