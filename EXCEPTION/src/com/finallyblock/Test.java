package com.finallyblock;

public class Test {
	public static void main(String[] args) {
		try{
			System.out.println(10/0);
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("catch");
		}
		finally {
			System.out.println("exception finally");
		}
	}
}
//wirh or without exception finally block always executed 
/*           try{
                Risky code
             }
             catch(exception e){
             haneled code
             }
             finally{
             cleanup code
             }
 */
