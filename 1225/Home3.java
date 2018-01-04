package com.test5;
public class Home3 {
	public static <T> void printA(T a) {

		System.out.println("aaa    " + a);
	}

	public static <Y> void printB(Y b) {
		System.out.println("bbb    " + b);
	}
	public static void main(String[] args) {

		int a1 = 2;
		double b1=3.3;
		printA(a1);
		printB(b1);
	}
}

