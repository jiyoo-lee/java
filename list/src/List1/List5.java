package List1;

import java.util.LinkedList;
import java.util.Scanner;

public class List5 {

	public static void main(String[] args) {
		
		/* ���빮�� : ����ڰ� ���ڱݾ��� �Է��մϴ�. 
		 * �ش� ���� �ݾ� Ƚ���� �� 8���Դϴ�. 0~n���� �Է�
		 * �ش� �ݾ� �Է��� ������ ���� �հ� �ݾ��� ���*/
		
		
		LinkedList<Integer> listup = new LinkedList<>(); // �� �迭 
		Scanner sc = new Scanner(System.in);
		String money;
		int sum = 0; 
		
		for(;;) {
			System.out.println("�Ա��Ͻ� �ݾ��� �Է��ϼ���.");
			money = sc.next();
			try {
				int banking = Integer.parseInt(money);
				listup.add(banking); 
				sum += banking;
				int ea = listup.size();
				if(ea == 8) {
					System.out.println("�Ա�Ƚ���� ����Ǿ� �����մϴ�.");
					break;
					}
			}catch(Exception a){
				System.out.println("���ڸ� �Է°����մϴ�. Ȯ�� ��Ź�帳�ϴ�.");
			}
		}
		System.out.println("�� �Աݾ��� " +sum+"�� �Դϴ�.");
		
		sc.close();
	}

}
