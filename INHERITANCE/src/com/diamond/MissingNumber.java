package com.diamond;

public class MissingNumber {

	public static void main(String[] args) {
		
		int num[]={1,2,4,5,6,7,9,10};
		int n1=findMissingNumber(num, 10);
		System.out.println(n1);
		
	}
	public static int findMissingNumber(int num[], int totalcunt){
		 
		int sum=totalcunt*((totalcunt+1)/2);
		int ActSum=0;
		for(int i:num){
			ActSum +=i;
		}
		return sum-ActSum;
	}
}
