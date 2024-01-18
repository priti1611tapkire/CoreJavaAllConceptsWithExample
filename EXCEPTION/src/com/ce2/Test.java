package com.ce2;

public class Test {
	public static void main(String[] args) throws EmailNotUnique {

		String username="prit@gmail.com";


		if(username.equals("prit@gmail.com")) {
			try {
				throw new EmailNotUnique("Email is same..!");
			} catch (Exception e) {
				e.getMessage();
				e.printStackTrace();
			}
		}
		else {
			throw new EmailNotUnique("Email is not Same...!");
		}	

	}


}
