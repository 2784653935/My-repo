package com.xwm.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\\\");
		Matcher matcher = pattern.matcher("\\");
		boolean a = matcher.matches();
		System.out.println(a);
		boolean b = Pattern.matches("\\\\", "\\\\");
		System.out.println(b);
		
		 // ��ָ��ģʽ���ַ�������
	      String line = "This order was placed for QT3000! OK?";
	      String pattern2 = "(\\D*)(\\d+)(.*)";
	 
	      // ���� Pattern ����
	      Pattern r = Pattern.compile(pattern2);
	 
	      // ���ڴ��� matcher ����
	      Matcher m = r.matcher(line);
	      if (m.find( )) {
	        // System.out.println("Found value: " + m.group(0) );
	        // System.out.println("Found value: " + m.group(1) );
	        // System.out.println("Found value: " + m.group(2) );
	         System.out.println("Found value: " + m.group(3) ); 
	      } else {
	         System.out.println("NO MATCH");
	      }
	}
}
