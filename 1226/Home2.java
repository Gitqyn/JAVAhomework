package com.test6;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Home2 {
	public static void main(String[] args) {
		Set<Object> b = new HashSet<Object>();
		b.add("000");
		b.add("111");
		b.add("abcd");
		System.out.println(b);
		Set<Object> b1 = new HashSet<Object>();
		b1.add("dcba");
		b1.add("555");
		b.addAll(b1);
		System.out.println("b1Ԫ����ӵ�b" + b);
		System.out.println(b.contains("111"));
		b.remove("000");
		System.out.println("�Ƴ�000" + b);
		System.out.println("����" + b.size());
		Iterator<Object> it = b.iterator();
		while (it.hasNext()) {
			Object c = it.next();
			if (c.equals("111")) {
				it.remove();
			}
		}
		System.out.println("������ɾ��111" + b);
	}
}
