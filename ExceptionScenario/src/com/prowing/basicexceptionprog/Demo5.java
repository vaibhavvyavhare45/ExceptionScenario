package com.prowing.basicexceptionprog;

public class Demo5 {
	public static void main(String[] args) {
		int a = extracted();
		 System.out.println(a);
	}
	
	public static int extracted() {
		int res=0;
		try {
			res=10/0;
			System.out.println("gfjj");
			System.exit(1);
			return 10;	
		}
		catch (Exception e) {
			System.out.println("aritj");
			return 20;
		}
	finally {
		System.out.println("finally block..");
		return 30;
	}
	}	
	

}
