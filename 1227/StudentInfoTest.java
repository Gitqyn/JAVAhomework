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
		StudentInfo a1 = new StudentInfo(001, "����", "����1");//������ʵ������ֵ
		StudentInfo a2 = new StudentInfo(002, "����", "����2");
		StudentInfo a3 = new StudentInfo(003, "����", "����3");
		List<Object> b = new ArrayList<>();//ѧ����Ϣ����List������
		b.add(a1);
		b.add(a2);
		b.add(a3);
		Map<Object, Object> c = new HashMap<>();
		Iterator<Object> it = b.iterator();//��List��һ��������
		while (it.hasNext()) {             //ѭ������������
			StudentInfo ai = (StudentInfo) it.next();
			c.put(ai.userId, ai);//���������ڵ���Ϣ��ӵ�Map������keyΪѧ�ţ�valueΪѧ����Ϣ
		}
		Set<Entry<Object, Object>> set = c.entrySet();//��Map�ڵ�Ԫ�ط���Set������
		Iterator<Entry<Object, Object>> i = set.iterator();//�ü���Set��������
		while (i.hasNext()) {  //ѭ������������
			Entry d=(Entry)i.next();
			System.out.println(d.getValue());
		}
	}
}
