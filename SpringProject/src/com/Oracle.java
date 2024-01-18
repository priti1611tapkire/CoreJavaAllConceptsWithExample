package com;

public class Oracle implements Connection{

	@Override
	public void commit() {
		// TODO Auto-generated method stub
		System.out.println("Oracle commit method");
	}

	@Override
	public void rollback() {
		// TODO Auto-generated method stub
		System.out.println("Oracle commit method");
	}

}
