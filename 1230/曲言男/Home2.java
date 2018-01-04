package com.test9;

import java.text.DecimalFormat;

public class Home2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat decimalFormat1 = new DecimalFormat("0.00");
		System.out.println(decimalFormat1.format(34.500));
		DecimalFormat decimalFormat2 = new DecimalFormat("0.0");
		System.out.println(decimalFormat2.format(34.500));
		DecimalFormat decimalFormat3 = new DecimalFormat("0.00%");
		System.out.println(decimalFormat3.format(34.500/100));
		DecimalFormat decimalFormat4 = new DecimalFormat("#.#\u2030");
		System.out.println(decimalFormat4.format(34.50/1000));
		DecimalFormat decimalFormat5 = new DecimalFormat("#.#$");
		System.out.println(decimalFormat5.format(34.50));
	}

}
