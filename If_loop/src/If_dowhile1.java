
public class If_dowhile1 {

	public static void main(String[] args) {
		/*
		 * ���빮�� do-while�� ������ 6�� �߿��� 35�̻� ���
		 */

		int a = 1;
		int b = 0;

		do {
			b = a * 6;
			if (b > 35) {
				//System.out.print(b + " ");
			}
			a++;
		} while (a < 10);

		/*
		 * ���빮�� 14~27���� ���� �� ¦������ ��� ���Ͽ� ���� ��� ���� ����ϼ���
		 */

		int c = 14;
		int sum = 0;
		
		do {
			if(c %2 ==0) {
				sum += c;
			} 
			c++;
		}while(c<28);
		
		System.out.print("���� : "+sum);

	}

}
