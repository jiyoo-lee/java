import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/*
		 * ���빮�� 7 : ����ڰ� ���� ������ Ȯ���Ͽ� ���� �Է� �� �ش� ����� �����ϴ� ���μ��� ���� : ù��° �Է°�(��, 1~10������
		 * �Է�) ����2 : �ι�° �Է°�(��, 1~10������ �Է�) ����3 : ����° �Է°�(��, 1~10������ �Է�) ������ ���� : �ش� ������
		 * ���� ���� �����ȣ�� �����ÿ� +-/* equals �ش� ��� ��ȣ�� �°� ������ ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("�Է°��� �����ּ���(��, 1~10������ �Է�)");
		int q1 = sc.nextInt();
		System.out.println("�ι�° �Է°�(��, 1~10������ �Է�");
		int q2 = sc.nextInt();
		System.out.println("����° �Է°�(��, 1~10������ �Է�");
		int q3 = sc.nextInt();
		System.out.println("�ش� ������ ���� ���� ���ϴ� �����ȣ�� �����ÿ� +-/*");
		String q4 = sc.next();

		if (q4.equals("+")) {
			System.out.println(q1 + q2 + q3);
		} else if (q4.equals("-")) {
			System.out.println(q1 - q2 - q3);
		} else if (q4.equals("/")) {
			System.out.println((double)+q1 / q2 / q3); //�Ҽ������� ǥ���ϰ������ double ����ȯ�� ���ش�.
		} else {
			System.out.println(q1 * q2 * q3);
		}

		sc.close();
	}

}
