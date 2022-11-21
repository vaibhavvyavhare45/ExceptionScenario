package com.prowing.basicexceptionprog;
public class Demo4 {
public static void main(String[] args) {
	int i=10;
	int j=20;
	int result=0;
	try
	{
		System.out.println(result);
		System.exit(0);
		result=i/0;
		
		
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("current occured");
	}
	catch(Exception e)
	{
		System.out.println("ex occured");
	}
	finally
	{
		System.out.println("finally occured");
	}
}
}
