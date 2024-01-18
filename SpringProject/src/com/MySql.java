package com;

public class MySql implements Connection {

	@Override
	public void commit() {
		// TODO Auto-generated method stub
		System.out.println("MySql commit Method");
	}

	@Override
	public void rollback() {
		// TODO Auto-generated method stub
		System.out.println("MySql Rollback method");
	}

}
