package java_test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Examplefilereader {

	public static void main(String[] args) {
		
		/* 응용문제
		 * 사용자가 6개의 숫자를 입력 받습니다. 로또 프로그램입니다.
		 * 프로세서 시작시 숫자를 입력해주세요라고 시작 총 6번을 하게 됩니다.
		 * 그리고 lotto.txt 결과를 파일을 로드하여 사용자가 입력한 값과 결과를 비교하여 몇개를 맞췄는지를 검토하는
		 * 프로그램을 구현하시오.
		 * */
		Scanner sc = new Scanner(System.in);
		lotto lt = new lotto();		
		List<String> user = new ArrayList<>();
		
		for(int i =6; i >= 1 ; i--) {		
			System.out.println("로또 숫자를 입력해주세요.");
			String usernum = sc.next();
			try { 	
				user.add(usernum);
				Integer.parseInt(usernum);
				}
			catch(Exception a) {				
				System.out.println("문자는 입력하실수 없습니다.");
				i++;
			}
		}
		lt.comparewith(user);
		int count = lt.result();
		System.out.printf("%d개 맞추셨네요!",count);
		sc.close();
	}
}

class lotto {
	List<String> lottonumbers = null;
	List<String> userlotto = null;
	int count;
	
	public void dbload() {
		try {
			this.lottonumbers = Files.readAllLines(Paths.get("C:\\javatest\\JavatTest\\src\\java_test\\lotto.txt"));
			}
		catch(Exception e) {}
	}
	
	
	public void comparewith (List<String> a){
		dbload();
		this.userlotto = a;
		for(int i = 0; i<this.userlotto.size(); i++) {
			for(int j = 0; j<this.lottonumbers.size(); j++) {
			if(this.userlotto.get(i).contains(this.lottonumbers.get(j))) {
				count++;
				}
			}
		}
	}
	public int result() {
		
		return this.count;
	}
}
