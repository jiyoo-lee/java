import java.util.Scanner;

public class Example9_2 {

	public static void main(String[] args) {
		/* ���빮�� 9 : 
		 * a�л��� ���� ������ �Է� �ް� ��������� ������ ���α׷��� �����մϴ�.
		 *  
		 *  "������ �Է��ϼ���"��� ������ �� 5���� ������ �Ǹ�
		 *  ��� ������ �ջ��� �� 5���� ������ ���� ��հ��� ����ϼž� �մϴ�.
		 *  ��� �޽��� "�ش� ������ ������:"
		 *  ��, ���� ������ 40�� ������ ��� "������Դϴ�."��� �޽����� ��� �� ���μ����� �����մϴ�.
		 *  40�� �̻��� ��� "�հ�"�̶�� �޼����� ����ϼ���.
		 *  do-while������ �ۼ��Ͻÿ�.
		 *  
		 *  [�߰���ȹ]
		 *  "�Է��Ͻ� ���� ���� �����ּ���:"��� ���� ���� ��� �� �ش� ���� �� ��ŭ �ݺ����� ������ �Ǹ�,
		 *  ���� �� ��ŭ ��հ��� ����Ǿ�� �մϴ�.
		 *  
		 *  */
		
		Scanner sc = new Scanner(System.in);
		
		int i =0;
		int sum = 0;
		int count; // �ݺ� Ƚ�� 
		int score;
		String msg = "������ �Է��ϼ���."; 
	
		System.out.println("�Է��Ͻ� ���� ���� �����ּ���");
		count = sc.nextInt();
		
		do {
			System.out.println(msg);
			score = sc.nextInt();
			sum += score;
			i++;
		}while(i<count);
		
		int average = sum/count; // ��հ�
		
		if(average>40) {
			System.out.printf("�����:%d, �������:%d //"+"�հ��Դϴ�",count,average);
		}
		else {
			System.out.printf("�����:%d, �������:%d //"+"������Դϴ�",count,average);
		}
		
		sc.close();

	}
}
