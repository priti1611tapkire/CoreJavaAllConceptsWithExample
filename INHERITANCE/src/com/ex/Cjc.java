package com.ex;

public class Cjc {
	private int rollno;
	
	private String sname;
	
	private String course;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Cjc [rollno=" + rollno + ", sname=" + sname + ", course=" + course + "]";
	}

}
