
public class While_plus {

	public static void main(String[] args) {
		/* ���빮�� *
		  5���� 10���� �հ踦 ����ϼ���*/

		int a = 5; // �ʱⰪ
		int b = 11; // ������
		int sum = 0; // ����� �հ�ġ�� ������Ű�� ���� ������
		
		while(a<b) {
			sum += a; //sum = sum + a;
			a++;
		}
		
		System.out.println("�հ�: "+sum);
		
		/* ���빮�� : 3 ~ 8���� ���� �� �հ� ���� ����Ͻÿ� */
		
		int aa = 3;
		int bb = 1; //���ϱ� �հ踦 ������ 1 �⺻������ ���� 
		
		while(aa<9) {
			bb = bb * aa ; //���ϱ�� 0
			aa++;
		}
		System.out.println(bb);
	}

}
