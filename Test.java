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
			ops = new ObjectOutputStream(new FileOutputStream("D:\\Software\\IDEA\\JAVA_project\\综合练习3-抽象类\\src\\wbb"));
			ComputerTeacher computerTeacher = new ComputerTeacher("王冰冰", "吉林", "记者", 31);
			ops.writeObject(computerTeacher);
			System.out.println("序列化成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("序列化失败");
		}finally {
			ops.close();
		}
	}
	public static void fxlh() throws ClassNotFoundException{
		ObjectInputStream inputStream =null;
		try {
			inputStream = new ObjectInputStream(new FileInputStream("D:\\Software\\IDEA\\JAVA_project\\综合练习3-抽象类\\src\\wbb"));
			ComputerTeacher computerTeacher = (ComputerTeacher) inputStream.readObject();
			System.out.println(computerTeacher.toString());
			System.out.println(computerTeacher.work());
			System.out.println("反序列化成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("反序列化失败");
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
