package com.test8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Home4 {

	public static void main(String[] args) {
		Random R1 = new Random(10);
		Set<Integer> set=new HashSet<>() ;
		while(set.size()<10){
			set.add(R1.nextInt(50));
			
		}
		System.out.println(set);
	
	Random R2 = new Random();
	List <String> list=new ArrayList<>();
	list.add("ÇúÑÔÄĞ");
	list.add("Â³ÕıÕı");
	list.add("ÂŞÆ½Æ½");
	list.add("ÁõÑàÓ¨");
	list.add("Íõäì");
	list.add("ÑîĞñ");
	System.out.println(list.get(R2.nextInt(list.size())));


	}
}
