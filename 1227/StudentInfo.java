package com.test7;
public class StudentInfo {   //�½�ѧ�����������userId��userName��className
int userId;
String userName;
String className;
public StudentInfo(int userId, String userName, String className) {//��һ��������
	super();
	this.userId = userId;
	this.userName = userName;
	this.className = className;
}
@Override
public String toString() {//toString
	return userName+"��ѧ�ţ�"+userId+"�༶Ϊ"+className;
}

}
