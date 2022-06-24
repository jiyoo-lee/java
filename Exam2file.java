package java_test;

import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class Exam2file {

	public static void main(String[] args) {

		lotto2 lt = new lotto2();
		lt.setter();
		
	}

}

class lotto2 {
	
	Scanner sc = new Scanner(System.in);
	LinkedList<Integer> k = null;
	String url = "C:\\javatest\\JavatTest\\src\\java_test\\lotto.txt";
	
	public void setter() {
		try {
		this.fileload();
		}
		catch(Exception a){ }
	}
	
	public String getter() {
		return null;
	}
	
	public void fileload() {
		//InputStream is = new FileInputStream("");
		
		try {
			
			FileInputStream fi = new FileInputStream(this.url);
			//System.out.println(fi.available()); // 파일 전체 크기
			byte[] temp = new byte[fi.available()];
			int ea = fi.read(temp);
			String test = new String(temp,0,ea);
			System.out.println(test);
			
			//반복문 
			
			}
		catch(Exception e) { System.out.println(e.getMessage()); }
				
	}
}