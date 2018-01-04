package com.test7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class StudentInfoTest {
	public static void main(String[] args) {
		StudentInfo a1 = new StudentInfo(001, "张三", "电信1");//构造器实例化赋值
		StudentInfo a2 = new StudentInfo(002, "李四", "电信2");
		StudentInfo a3 = new StudentInfo(003, "王五", "电信3");
		List<Object> b = new ArrayList<>();//学生信息加入List集合中
		b.add(a1);
		b.add(a2);
		b.add(a3);
		Map<Object, Object> c = new HashMap<>();
		Iterator<Object> it = b.iterator();//用List做一个迭代器
		while (it.hasNext()) {             //循环遍历迭代器
			StudentInfo ai = (StudentInfo) it.next();
			c.put(ai.userId, ai);//将迭代器内的信息添加到Map集合中key为学号，value为学生信息
		}
		Set<Entry<Object, Object>> set = c.entrySet();//将Map内的元素放入Set集合中
		Iterator<Entry<Object, Object>> i = set.iterator();//用集合Set做迭代器
		while (i.hasNext()) {  //循环遍历迭代器
			Entry d=(Entry)i.next();
			System.out.println(d.getValue());
		}
	}
}
