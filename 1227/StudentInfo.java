package com.test7;
public class StudentInfo {   //新建学生类加入属性userId、userName、className
int userId;
String userName;
String className;
public StudentInfo(int userId, String userName, String className) {//建一个构造器
	super();
	this.userId = userId;
	this.userName = userName;
	this.className = className;
}
@Override
public String toString() {//toString
	return userName+"的学号："+userId+"班级为"+className;
}

}
