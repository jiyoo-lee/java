
public class App {

	public static void main(String[] args) {
		int a = 25 + 31 * 4 + 12;
		int b = 15 * 3 + 9 + 14;

		if (b > a) {
			System.out.println("���� 1�� ���� �۽��ϴ�.");
		} else if (a > b) {
			System.out.println("���� 2�� ���� �۽��ϴ�.");
		} else {
			System.out.println("�� ���� �����ϴ�.");
		}

		/* �ش� ���� 2������ ¦��,Ȧ���� Ȯ���ϱ� */
		int c = b % 2; // %��ȣ�� ���� 0 �Ǵ� 1�� ������ ���� ����� �˴ϴ�.
		System.out.println(c);

		if (c == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}

	}
}