
public class If_for2 {

	public static void main(String[] args) {
		/* 1���� 100���� ���� �� 80�̻��� ���ڸ� ��� */

		/*
		 * int num; for(num=1; num<101; num++) { if(num>=80) {
		 * System.out.print(num+" "); } } //end of for
		 */

		/* ���빮�� 1 : 200~300 �� 240 ������ �� */
		// int num1;
		// for(num1=200; num1<301; num1++) {
		// if(num1<=240) {
		// System.out.print(num1+" ");
		// }
		// }

		/* ���빮�� 2 : 1~10���� ������ ¦���� ����Ͻÿ�. */

		final int a = 4;
		int b;
		for (b = 1; b < 11; b++) {
			if (b % a == 0) {
				System.out.printf("%d ", b);
			}
		}

		/* ���빮�� 3 : ������ �� 2���� �ݺ��մϴ�. ��,2�� ����� �� 10�̻� ���ڸ� ����մϴ�. */

		int ss;
		int dan = 2;
		int num = 10;
		int sum;

		for (ss = 1; ss < num; ss++) {
			sum = dan * ss;
			if (sum >= num) {
				System.out.println(sum);
			}
		}

		/*
		 * ���빮�� 4 : ���� ��� ���� ���� �ش� ���� ��µǵ��� �ڵ带 �����Ͻÿ�. ����� : 18 36 54 72
		 */

		int num1; //�ʱⰪ
		int sum1; // �����

		for (num1 = 1; num1 < 10; num1++) {
			sum1 = num1 * 9;
			if (num1%2 ==0) {
				System.out.println(sum1);
			}
		}
		
		
		/*���빮�� 5: ���� ������� ���� �ش� ���� ��µǵ��� �ڵ带 �����Ͻÿ�
		 * 1~20 ������ �����Դϴ�.
		 * ����� : 6 14 17 19*/
		 // ��Ģ���� ���� ���� ����ϴ� ��
		
		int j;
		
		for(j=1; j<=20; j++) {
			if(j==6 || j==14 || j==17 || j == 19 ) {
				System.out.print(j+" ");
			}
		}
		
		
		
		
		
		
		
		
		
		

	} // end of main

}
