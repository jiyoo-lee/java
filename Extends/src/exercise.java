import java.util.Scanner;

public class exercise {

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
		System.out.println("�Է��Ͻ� ������� �����ּ���.");
		int subject = sc.nextInt();
		
		int i = 1;
		double sum = 0;
		do {
			System.out.println("������ �Է��ϼ���.");
			double score = sc.nextInt();
			sum += (score)/subject;
			i++;
		}while(i <= subject);
		
		String msg;
		if(sum <= 40) {
			msg = "������Դϴ�.";
		}
		else {
			msg = "�հ��Դϴ�.";
		}
		System.out.println("���: "+sum+" ��� : "+ msg);
		
		sc.close();
	}
}
