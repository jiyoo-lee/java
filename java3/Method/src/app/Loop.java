package app;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args)  {
		/*���빮��
		 * ���ڵ�� ��ǰ�� �Է½����ּ����� �ϰ� �ݾ��� �Է��ϰ�(3���ݺ�)
		 * "���� %�� �Է����ּ���"��� ������ �Բ� �ش� ���� ���ڸ� �Է��ϸ� ���� �ݾ��� ����Ǿ� ��µǵ��� �մϴ�.
		 * ��ĳ��, if��,sysout
		 * ��Ʈ: int money = 10000 ;
		 * int coupon = 20;
		 * double discount = coupon * 0.01 -> 0.2
		 * 
		 * system.out.println(discount) 
		 * double a = money * discount
		 * system.out.println(discount)
		 * int c = money -(int)( a ) //double c�� �ᵵ �� 
		 * system.out.println(c)*/
		
		Scanner sc = new Scanner(System.in);
		int prices = 0;
		double sum = 0;
		
		for(int i = 0; i <= 2; i++) {
			System.out.println("���ڵ�� ��ǰ�� �Է½����ּ���.");
			prices += sc.nextInt();
		}
		System.out.println("���� %�� �Է����ּ���.");
		double discount = 0;
		discount = sc.nextDouble() * 0.01;
		
		if(discount > 0) {
			sum = prices * discount;
		}
		System.out.println((int)sum+"�� �Դϴ�.");
	}
}
