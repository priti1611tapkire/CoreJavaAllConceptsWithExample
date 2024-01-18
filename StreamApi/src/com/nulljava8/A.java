package com.nulljava8;

import java.util.Optional;

public class A {
	public static void main(String[] args) {
		try{
		String s=null;
		System.out.println(s.length());
		}
		catch (Exception e) {
			// TODO: handle exception
			Optional<String> value=Optional.empty();
			System.out.println(value);
		}
	}
}
