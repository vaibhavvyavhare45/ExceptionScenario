package com.prowing.basicexceptionprog;

public class Demo1 {
	public static void main(String[] args) {

		doStuff();
	}

	public static void doStuff() {
		doMoreStuff();
	}

	public static void doMoreStuff() {
		System.out.println("hello");

	}

}
