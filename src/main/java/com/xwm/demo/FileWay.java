package com.xwm.demo;

import java.io.File;

public class FileWay {
	public static void main(String[] args) {
		File directory = new File("");// �趨Ϊ��ǰ�ļ���
		try {
			System.out.println(directory.getCanonicalPath());// ��ȡ��׼��·��
			System.out.println(directory.getAbsolutePath());// ��ȡ����·��
		} catch (Exception e) {
		}
		System.out.println("\\/\\\\\\\\\\");
	}
}
