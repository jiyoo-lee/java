import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
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
			
			int i;
			int again = 3;
			double sum= 0;
			
			for(i=1;i<=again;i++) {
				System.out.println("���ڵ�� ��ǰ�ݾ��� �Է½����ּ���");
				int price = sc.nextInt();
				sum += price;
			}	
			
			System.out.println("����%�� �Է½����ּ���");
			double discount = sc.nextDouble() * 0.01;
			
			if(discount >= 0) { 
				sum -= sum * discount;
			}
			
			System.out.println((int)sum+"�� �Դϴ�.");
			
			sc.close();
			
			
			/* ����ݺ��� ��뿹 : 2���� �迭 (ex.�Խ���)
			 * �ݺ��� �ϳ� : Ȩ������ ������ �ѹ�
			 * 
			 * 
			 * 
			 * 
			 * */

	}

}
