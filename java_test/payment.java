package java_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class payment {

	public static void main(String[] args) {
	
			Payrolls py = new Payrolls();
			py.start();
			int[] result = py.check();
			System.out.println("�� �Աݾ�: " +result[1]+ "�� �ܾ� : "+result[0]+"��");
			
	}
}


class Payrolls extends abstract_ {	
	String filename = null;
	int total = 0;
	int allmoney = this.money; //�ܰ� �ݾ� ��������
	
	//�Ա� ��Ʈ 
	public void input_sc() {
		Scanner sc = new Scanner(System.in);
		
		int deposit = 0; // �繫�� ����ڰ� �Է��ϴ� �޿�
		int c = 0; // �ݺ��� ����
		while(c < this.em_name.size()) {
			System.out.println("��ü�� �����մϴ�. [" +this.em_name.get(c)+"]�Կ��� ��ü�Ͻ� �ݾ��� �Է����ּ���.");
			deposit = sc.nextInt();
			this.allmoney -= this.total;
			this.total += deposit;
			c++;
		}
		sc.close();
	}
	
	@Override
	public void start() {
		try {
			this.filename = "C:\\javatest\\JavatTest\\employee.txt";
			this.db();
			this.input_sc();
			
			
		}
		catch(Exception a) {
			System.out.println(a);
		}
	}
	
	@Override
	public void db() throws IOException{
		
		this.em_name = new ArrayList<>(); //�� �迭
		this.fr = new FileReader(this.filename,Charset.forName("UTF-8"));
		BufferedReader br = new BufferedReader(fr);
		String data = br.readLine();
		String user[] = data.split(",");
		
		int ea = user.length;
		int w = 0;
		while(w < ea) {
			this.em_name.add(user[w]);
			w++;
		}
		br.close();
	}
	
	@Override
	public int[] check() {
		int aa = this.allmoney;
		int bb = this.total;
		return new int[] {aa,bb};
	}
	
}