import java.util.Scanner;

public class Example9 {

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
		System.out.println("�Է��Ͻ� ���� ���� �����ּ���.");
		int subject = sc.nextInt();
		
		int w = 1;
		int user;
		int total=0;
		
		while(w<=subject) {
			System.out.println("������ �Է����ּ���: ");
			user = sc.nextInt();
			total += user;
						
			w++;
		}
		double avg = total / subject;
		String msg;
		if(avg<40) {
			msg = "������Դϴ�.";
			System.out.println(msg);
		}
		else {
			msg = "�հ��Դϴ�.";
		}
		
		System.out.println("������� ���� :"+avg+"���̸�,"+msg);
		sc.close();
	}
}
