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
		System.out.println("插入AAA:" + A);
		List<Object> B = new ArrayList<Object>();
		B.add("BBB");
		A.addAll(2, B);
		System.out.println("插入B集合:" + A);
		System.out.println("获取第二个元素" + A.get(1));
		A.set(3, "123");
		System.out.println("第四个元素改为123" + A);
		A.remove(1);
		System.out.println("删除第二个元素" + A);
		Iterator C = A.iterator();
		while (C.hasNext()) {
			Object D = (Object) C.next();
			if (D.equals("123")) {
				C.remove();
			}
		}
		System.out.println("迭代器删除123后" + A);
	}

}
