
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		int balance = 100_000;
		Scanner sc = new Scanner(System.in);
		System.out.println("1�� �Է½� �Ա�, 2�� �Է½� ����Դϴ�.");
		int type = sc.nextInt();

		if (type == 1) {
			System.out.println("�Ա� �� �ݾ��� �Է��ϼ���.");
			int deposit = sc.nextInt();
			balance += deposit;
			System.out.println(balance + "�� �Դϴ�.");
		} else if (type == 2) {
			System.out.println("��� �� �ݾ��� �Է��ϼ���.");
			int withdraw = sc.nextInt();
			balance -= withdraw;
			if (balance >= 0) {
				System.out.println(balance + "�� �Դϴ�.");
			}
			if (balance < 0) {
				System.out.println("��� �ݾ��� ���� �ݾ׺��� Ů�ϴ�.");
			}
		} else {
			System.out.println("��ȣ�� �ٽ� Ȯ�����ּ���. 1: �Ա� 2: ���");
		}

		sc.close();

	} // end of main

}
