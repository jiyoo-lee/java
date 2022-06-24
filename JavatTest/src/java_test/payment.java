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
			System.out.println("총 입금액: " +result[1]+ "원 잔액 : "+result[0]+"원");
			
	}
}


class Payrolls extends abstract_ {	
	String filename = null;
	int total = 0;
	int allmoney = this.money; //잔고 금액 가져오기
	
	//입금 파트 
	public void input_sc() {
		Scanner sc = new Scanner(System.in);
		
		int deposit = 0; // 재무과 담당자가 입력하는 급여
		int c = 0; // 반복문 변수
		while(c < this.em_name.size()) {
			System.out.println("이체를 시작합니다. [" +this.em_name.get(c)+"]님에게 이체하실 금액을 입력해주세요.");
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
		
		this.em_name = new ArrayList<>(); //빈 배열
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