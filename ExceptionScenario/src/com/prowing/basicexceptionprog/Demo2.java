package com.prowing.basicexceptionprog;

public class Demo2 {
	public static void main(String[] args) {
		int  i=10;
		int j=20;
		int k=10;
		int res=0;
		try {
			//System.exit(0);// the program is terminated
		System.out.println(res);
		res=10/(i-k);
		System.exit(0);
		
		}
		catch (NullPointerException e) {
			System.out.println("catch block executed...");
		}
		finally {
			System.out.println("finally block is executed.. ");
		}
	}

}
