package com.test8;

public class Home2 {
	public static void main(String[] args) {
		String stb = "HelloWord";
		StringBuffer stb1 = new StringBuffer();
		stb1.append(stb);
		stb1.insert(9, "A");
		System.out.println(stb1);
		stb1.toString();
		System.out.println(stb1.indexOf("d"));
		System.out.println(stb1.substring(0, 5));
		System.out.println(stb1.replace(0, 5, "Hi"));
		stb1.setCharAt(6, 'a');
		System.out.println(stb1.delete(0, 2));
		System.out.println(stb1.reverse());
		
	}
}
