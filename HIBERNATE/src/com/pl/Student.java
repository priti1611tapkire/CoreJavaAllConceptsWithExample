package com.pl;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity

@Getter
@Setter


public class Student {
@Id
	private int id;
	private String name;
	private String address;
	private String monbno;
	private String email;
	private double styphun;
	private double fees;
	
}
