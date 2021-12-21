package com.atgao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Rain {
	//写入
	public void writrt(){
		FileWriter fileWriter =null;
		String s=" hhhhhhhhhhRain　Rain is falling all around, It falls on field and tree, It rains on the umbrella here, And on the ships at sea.";
		try {
			fileWriter = new FileWriter("D://abc.txt");
			fileWriter.write(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fileWriter==null){
				System.out.println("写入失败");
			}else {
				System.out.println("写入成功");
			}
		}
		
	}
	//复制
	public void copy() throws IOException{
		String s="";
		File file = new File("D://abc.txt");
		File fileCopy = new File("D://abc123.txt");
		try {
			FileReader fileReader = new FileReader(file);
			FileWriter fileWriter = new FileWriter(fileCopy);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			while((s=bufferedReader.readLine())!=null){
				bufferedWriter.write(s);
			}
			bufferedReader.close();
			bufferedWriter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	//改名字
	public void cName(){
		File fileB = new File("D://abc123.txt");
		File fileL = new File("D://abc12344.txt");
		boolean renameTo = fileB.renameTo(fileL);
		System.out.println(renameTo==true?"修改成功":"修改失败");
	}
}
