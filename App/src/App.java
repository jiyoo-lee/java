
public class App {

	public static void main(String[] args) {

		int a = 10, b = 20;
		int c;
		// ��Ģ�����ȣ: +, - , * , /

		// c = a + b;
		// c = a - b;
		// c = a * b;
		c = b / a;
		System.out.println(c);

		String a1 = "ȫ�浿";
		String b1 = "ȯ���մϴ�.";
		String c1;

		c1 = a1 + b1; // ���������϶� +�� ���� + ���ڿ��� ǥ���� �� �ֽ��ϴ�.
		System.out.println(c1);

		/*
		 * ���빮�� ������ ���� ��µǴ� �ڵ带 �ϼ��Ͻÿ� ȫ�浿�� �������� 50000 �Դϴ�. ��, ȫ�浿�� 50000�� ���� ���������� ��ȭ�� ��
		 * �ֽ��ϴ�.
		 */

		String name = "ȫ�浿";
		int money = 50000;

		System.out.println(name + "�� �������� " + money + " �Դϴ�.");

		/*
		 * ���빮�� �Ƹ��� ����Ʈ���� ��ǰ�� �����߽��ϴ�. ��ٱ��Ͽ� ���� ��ǰ������ ��� ���ؼ� �� ���� �ݾ��� ��µǵ��� �Ͻÿ�. ��, $ȯ����
		 * ��� �Ǿ�� �մϴ�. 8.25 4.02 3.71
		 * 
		 * ������� ������ ���� ����ϼ��� �� �����ݾ� $ ������ �Դϴ�.
		 */

		float price1 = 8.25f;
		float price2 = 4.02f;
		float price3 = 3.71f;

		float sum = price1 + price2 + price3;

		System.out.println("�� �����ݾ� $" + sum + "�Դϴ�.");

		double p1, p2, p3, p4;
		p1 = 8.25;
		p2 = 4.02;
		p3 = 3.71;

		p4 = p1 + p2 + p3; // ������ Ǯ�� ���

		System.out.println("�� �����ݾ� $" + p4 + "�Դϴ�.");

		int k = 3;
		int j = 9;
		double aw = (double) k / j; // ���������� �ڷ��� ���� �ִ� �ڵ�
		// ���� ������ ����ȯ�ؼ� double�� ��ȯ������(�׽�Ʈ���¸� ����ȯ ������)
		System.out.println(aw);

		// JAVA ���� ����Ű : CTRL+F11 (ECLIPSE ����)
		// JAVA �ڵ� ���� : CTRL + SHIFT + F
	}

}
