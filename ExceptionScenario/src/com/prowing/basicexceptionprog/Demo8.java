package com.prowing.basicexceptionprog;

public class Demo8 {
public static void main(String[] args) {
	int res=0;
	int a[]= {1,3,8,7};
	try {
		res=13/1;
		try {
			int b=a[4]/res;
			System.exit(res);
			
		} catch (ArithmeticException e) {
			System.out.println("Inner catch block");
		}
		finally {
			System.out.println("Inner finally block");
		}
	} catch(Exception e) {
	System.out.println("outer catch block");	
	}
	System.out.println("outer finally block");
}
}
