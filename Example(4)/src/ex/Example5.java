package ex;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Example5 {
	
	
	public static void main(String[] args) {
		/*���빮��
		 * ����ڰ� ���� ���ڸ� �Է¹޽��ϴ�.
		 * scanner ���� ����ڰ� ���ڸ� �Է��� ��� ����ó���� ����Ǿ�� �մϴ�.
		 * �� ���� �Է��� 7���̸� ����ڰ� �Է��� ���ڸ� ������������ �����մϴ�. 
		 * �߰��ɼ� : ¦���� Ȧ������ ������ �迭�� �����ϵ��� �մϴ�.*/
	
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> oddnums = new LinkedList<>(); //Ȧ��
		LinkedList<Integer> evennums = new LinkedList<>(); // ¦�� 
		
			for(int i =7; i>0; i--) {  //������ 7���� ������� �ϸ� ���� ������ 
				System.out.println("���ڸ� �Է��ϼ���");
				try {
					Integer num = Integer.valueOf(sc.next());
					if(num%2== 1) {
					oddnums.add(num);
					}
					else {
						evennums.add(num);
						}
					}
				catch(Exception ab) {
					System.out.println("���ڸ� �Է��ϼž��մϴ�.");
					i++;
				};
			}
	
		Collections.sort(oddnums);
		Collections.sort(evennums);
		System.out.println(oddnums);
		System.out.println(evennums);
		
	
		sc.close();
	
	}	
}
