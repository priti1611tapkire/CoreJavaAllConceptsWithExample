package com.join;

class ThreadJoinDemo
{
	public static void main(String[] args)throws InterruptedException
	{
		System.out.println("M");
		Thread.sleep(3000);
		System.out.println("E");
		Thread.sleep(1000);
		System.out.println("G");
		Thread.sleep(10000);
		System.out.println("A");
	}
}