package java_test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Examplefilereader {

	public static void main(String[] args) {
		
		/* ���빮��
		 * ����ڰ� 6���� ���ڸ� �Է� �޽��ϴ�. �ζ� ���α׷��Դϴ�.
		 * ���μ��� ���۽� ���ڸ� �Է����ּ����� ���� �� 6���� �ϰ� �˴ϴ�.
		 * �׸��� lotto.txt ����� ������ �ε��Ͽ� ����ڰ� �Է��� ���� ����� ���Ͽ� ��� ��������� �����ϴ�
		 * ���α׷��� �����Ͻÿ�.
		 * */
		Scanner sc = new Scanner(System.in);
		lotto lt = new lotto();		
		List<String> user = new ArrayList<>();
		
		for(int i =6; i >= 1 ; i--) {		
			System.out.println("�ζ� ���ڸ� �Է����ּ���.");
			String usernum = sc.next();
			try { 	
				user.add(usernum);
				Integer.parseInt(usernum);
				}
			catch(Exception a) {				
				System.out.println("���ڴ� �Է��ϽǼ� �����ϴ�.");
				i++;
			}
		}
		lt.comparewith(user);
		int count = lt.result();
		System.out.printf("%d�� ���߼̳׿�!",count);
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
