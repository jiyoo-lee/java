package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {

	public static void main(String[] args) throws IOException {
		
		/* ���빮�� 
		 * ȸ�� ���� DB�� �ִ� ��Ȳ�Դϴ�. �ش����� �߿��� NAVER.COM ���� �ּҸ� ����ϴ� �� �� �ο����� ��� (������ �м�)
		 * ��, db�� �ε�� �߻� Ŭ�������� �ε尡 �ǵ��� �մϴ�.
		 * { �̸�, ��Ż�, ��ȭ��ȣ, ����, �ּ�, �̸���, ����Ʈ } 
		 *  ������ �迭 : http://mekeyace.dothome.co.kr/example2_db.txt
		 *  */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ã�����ϴ� ����ȸ�縦 �Է��ϼ���.");
		String company = br.readLine();
		
		Listup lu = new Listup();
		lu.find(company);
		System.out.println(company+ "������ �̿��ϴ� ������ "+lu.value()+"�� �Դϴ�.");

	}
}

abstract class DB {
	String[][] userInform;
	
	public abstract void db(); // ������ �ε� 
	
	public abstract void find(String company); //Ư�� �̸��� �ּҸ� ���� ���� ã�� �޼ҵ�
	
	public abstract void add(); // ������� �����ִ� �޼ҵ� 
	
	public abstract int value(); // �� �����ִ� �޼ҵ�
	
	}



class Listup extends DB {
	private int count;
	private String c;
	
	@Override
	public void db() {
		
		this.userInform = new String[][] {
			{"ȫ�浿","SKT","010-1236-4879","45","���α�","hong@gmail.com","2200"},
			{"�赵��","LG","010-1267-5879","25","������","kim@nate.com","2100"},
			{"���Ѽ�","LG","010-1267-4112","37","���α�","soso4112@naver.com","1200"},
			{"���缺","SKT","010-3221-8871","41","������","jsung_kks@naver.com","700"},
			{"�ѿ�","KT","010-2455-4879","22","��õ��","han1004@nate.com","920"},
			{"������","SKT","010-3770-4009","34","���α�","kans32@gmail.com","1250"},
			{"���","KT","010-1606-3137","20","����","kimsil_love@nate.com","4505"},
			{"���Ѱ�","SKT","010-3412-0902","31","��õ��","hanso12@nate.com","2125"},
			{"������","LG","010-4557-8282","30","����","jehyuk@naver.com","8160"},
			{"�̼���","KT","010-3738-4800","55","������","sunyoung@nate.com","4510"},
			{"������","SKT","010-5242-0879","42","������","chreey@gmail.com","6720"}
										};
								}
	
	@Override
	public void find(String com) {	
		db();
		this.c = com;
		
		if(this.c.equals("")) {
			System.out.println("������ �˻��Ͻ� �� �����ϴ�.");
			System.exit(0);
		}
		else {
			add();
		}
	}
	
	@Override
	public void add() {
		
		/* ���������� �迭�������� ī������ �ϰ� ��. indexOf : -1 ���� -1���� ������ ���� �ִ� ��. */
		for(int i = 0; i < this.userInform.length; i++) {
				if(this.userInform[i][5].contains(this.c)) {
					this.count++;
			}
		}	
	}
	
	/* ArrayList�� ������ �޸� �ҵ��� �ʹ� ���� �ϴ� �߻��� �� ����.*/
	
	@Override
	public int value() {
		
		return this.count;
	}
	
	
}