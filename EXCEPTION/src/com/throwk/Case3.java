package com.throwk;

@SuppressWarnings("serial")
public class Case3 extends RuntimeException {
	public static void main(String[] args) {
		throw new Case3();
	}
}
