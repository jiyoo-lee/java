import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/*
		 * ���빮�� : ����ڰ� �Է��� ���ڿ� ���缭 �������� �۵��Ǹ� ������ ����Ͽ� ¦������ Ȧ�� ���� ����Ͻÿ� �������� �Է��ϼ����� �޼�����
		 * ��µǸ� �ش� ���ڿ� ���缭 ��� ����� ���ϸ� ���� ���� ���� ¦������ Ȧ������ ��� �ش� �ݺ����� for~do while���� �Ѱ���
		 * �����ؼ� �ۼ��ϼ���.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("���ϴ� �������� �Է��ϼ���[����� �� ¦���� Ȧ���� �˷��帳�ϴ�.]");
		int user = sc.nextInt();

		int gugu;
		int sum = 0;

		for (gugu = 1; gugu < 10; gugu++) {
			sum += gugu * user;
		}

		if (sum % 2 == 0) {
			System.out.println("�����: " + sum + "¦���Դϴ�.");
		} else {
			System.out.println("�����: " + sum + "Ȧ���Դϴ�.");
		}

		sc.close();

	}

}
