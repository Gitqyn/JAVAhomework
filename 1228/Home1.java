package com.test8;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Home1 {     // propertise�ೣ�õĲ���
	public static String GetValueByKey(String filePath, String key) {// ����key��ȡvalue
		Properties pps = new Properties();
		try {
			InputStream in = new BufferedInputStream(new FileInputStream(filePath));// ��ȡ�ļ�
			pps.load(in);
		} catch (Exception e) {
		}
		String value = pps.getProperty(key);
		return value;

	}

	public static void Get(String filePath)  {//��ȡPropertiesȫ����Ϣ
try {
	Properties pps = new Properties();
	InputStream in = new BufferedInputStream(new FileInputStream(filePath));
	pps.load(in);	
	//hash����
	Iterator en = (Iterator) pps.propertyNames();
	while (en.hasNext()) {
		String strKey=(String)en.next();
		String strValue=pps.getProperty(strKey);
		System.out.println(strKey+"="+strValue);
	} 
} catch (Exception e) {
	// TODO: handle exception
}
	}		
public static void Write(String filePath, String pValue,String pkey) {
	try {
		Properties pps=new Properties();
		InputStream in=new FileInputStream(filePath);
		pps.load(in);
		OutputStream out=new FileOutputStream(filePath); 
		pps.setProperty("123", "aaa");
		pps.setProperty("133", "a2a");
		pps.store(out, "Update");
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

public static void main(String[] args) throws IOException{
	String value=GetValueByKey("D:\\test.properties", "1001");
	Write("D:\\test.properties", "����", "1001");
	
}
}