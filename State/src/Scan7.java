import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {

		/*
		 * ���빮�� [������ȣ �߼ۿ� ���� ��ȣ �ڵ�] �޼����� �������� ��ȣ�� �Է��ϼ���. ���� 220524 ����ڰ� ���� 220524 �ܿ� �Է½�
		 * "������ȣ�� Ʋ���ϴ�."��� ����Ͻð� ������ ������ȣ ���ڸ� �Է½� "����Ȯ�� �Ǽ̽��ϴ�."��� ����մϴ�. ��, 220524�� java
		 * ����� ���� ���� ����Ǵ� ������ ó���ϼ���.
		 */
		int sc = 220524; //������ȣ

		Scanner s = new Scanner(System.in);
		System.out.println("�������� ��ȣ�� �Է��ϼ���.");
		int num = s.nextInt();

		if (num != sc) {
			System.out.println("������ȣ�� Ʋ���ϴ�.");
		} else {
			System.out.println("����Ȯ�� �Ǽ̽��ϴ�.");
		}

		s.close();
	}
	
}

//��ĳ�� import ��� �������(����� �Է������� ���� ����), ����ڰ� �Է��� ���� �޴� ������ ����
