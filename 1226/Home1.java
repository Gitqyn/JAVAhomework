package com.test6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Home1 {
	public static void main(String[] args) {
		List<Object> A = new ArrayList<Object>();
		A.add("aaa");
		A.add("bbb");
		A.add("ccc");
		A.add(1, "AAA");
		System.out.println("����AAA:" + A);
		List<Object> B = new ArrayList<Object>();
		B.add("BBB");
		A.addAll(2, B);
		System.out.println("����B����:" + A);
		System.out.println("��ȡ�ڶ���Ԫ��" + A.get(1));
		A.set(3, "123");
		System.out.println("���ĸ�Ԫ�ظ�Ϊ123" + A);
		A.remove(1);
		System.out.println("ɾ���ڶ���Ԫ��" + A);
		Iterator C = A.iterator();
		while (C.hasNext()) {
			Object D = (Object) C.next();
			if (D.equals("123")) {
				C.remove();
			}
		}
		System.out.println("������ɾ��123��" + A);
	}

}
