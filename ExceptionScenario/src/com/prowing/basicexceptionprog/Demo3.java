package com.prowing.basicexceptionprog;

public class Demo3 {
	public static void main(String[] args) {
		int a[]= {4,2,7,9};
		try {
			System.out.println(a[4]=10);
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
		//catch(Exception e1)  two exception of same types are not allowed		{
			System.out.println("occured");
		}
	}

//}
