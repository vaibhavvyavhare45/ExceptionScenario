
package com.prowing.basicexceptionprog;

public class Demo7 {
	public static void main(String[] args) {
		int res = 0;
		try {
			System.out.println(res);
			try {
				res = 12 / 0;

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Inner catch block");
			}

		} catch (Exception e) {
			System.out.println("outer catch block");
		}
	}

}
