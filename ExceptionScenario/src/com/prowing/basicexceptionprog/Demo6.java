package com.prowing.basicexceptionprog;

public class Demo6 {
	public static void main(String[] args) {
		int res = 0;
		res = 10 / 0;
		try {
			System.out.println();
		} catch (Exception e) {
			System.out.println("exception occured");
		} 
		//catch (NullPointerException e) {// unreachable catch block for NullPointerException
//			System.out.println("ghgghh");
//		}
			finally {
			System.out.println();
		}
	}
}
