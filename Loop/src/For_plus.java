
public class For_plus {

	public static void main(String[] args) {

		/* ���빮�� : 1~10���� ��� ���ڸ� ���� ������� ����Ͻÿ� */

		int f;
		int total = 0;

		for (f = 1; f <= 10; f++) { // total �������� �ݺ� ���� ���������� ������Ŵ
			total += f; // total = total + f; ex) total /= f;, total *= f; ���

		}
		// +=(���ϱ� �Ҵ�) -=(���� �Ҵ�) *= (���ϱ� �Ҵ�) /=(������ �Ҵ�)
		System.out.println("�� �հ�: " + total);
		
		
		/* ���빮��
		 ��ü���� 500�� �ֽ��ϴ�.
		 �� 8ȸ ���� �ݺ��Ǹ鼭 �ѹ� �ݺ��Ҷ����� 12�� �����ϵ��� �Ͽ� ���� ���� ����Ͻÿ�  		  
		  */
		
		int a;
		int sum = 500;
		int num = 12;
		
		for(a=1; a<=8;a++) {
			sum -= num; 
		}
		System.out.println(sum);
	}

}
