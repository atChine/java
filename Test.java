package com.atgao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test implements Serializable{
	public static void lxh() throws IOException{
		ObjectOutputStream ops =null;
		try {
			ops = new ObjectOutputStream(new FileOutputStream("D:\\Software\\IDEA\\JAVA_project\\�ۺ���ϰ3-������\\src\\wbb"));
			ComputerTeacher computerTeacher = new ComputerTeacher("������", "����", "����", 31);
			ops.writeObject(computerTeacher);
			System.out.println("���л��ɹ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("���л�ʧ��");
		}finally {
			ops.close();
		}
	}
	public static void fxlh() throws ClassNotFoundException{
		ObjectInputStream inputStream =null;
		try {
			inputStream = new ObjectInputStream(new FileInputStream("D:\\Software\\IDEA\\JAVA_project\\�ۺ���ϰ3-������\\src\\wbb"));
			ComputerTeacher computerTeacher = (ComputerTeacher) inputStream.readObject();
			System.out.println(computerTeacher.toString());
			System.out.println(computerTeacher.work());
			System.out.println("�����л��ɹ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�����л�ʧ��");
		}
		finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
