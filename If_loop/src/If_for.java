
public class If_for {

	public static void main(String[] args) {
		// final int a = 1; // final ���� �������� ����� ����. (���� ���� �Ǿ �� ���� �Ұ�)

		/* ��� : ���� ������ �ʴ� �� */
		// System.out.println(a); ���� �Ұ�

		// final String name = "ȫ�浿";
		// name = "�̼���";
		// System.out.println(name); ���� �Ұ�

		int ct = 5; // ������ �ǹ�: ���̵�
		int f; // �ݺ���
		boolean ok = false; // ���ǿ� ���� true , false

		for (f = 1; f < 10; f++) {
			if (f == ct) { // �ݺ��� ���� �������� ���� ���
				// System.out.println("��� �� ���� Ȯ�ε˴ϴ�.");
				ok = true; // ���ǿ� ���� ���� �����մϴ�.
			}

		} // end of for

		if (ok == false) {
			/*
			 * ���࿡ �ݺ����� �����µ��� �ݺ��� �ȿ� ���ǻ����� ������� ��µǴ� �ڵ� �Դϴ�.
			 */
			// System.out.println("���� Ȯ������ ���մϴ�.");
		}

		/* �� �������� ���� �ݺ��մϴ�. �� �� Ȧ�� ���� ����ϵ��� �մϴ�. */

		int a;
		String odd = ""; // odd�� Ȧ�� even�� ¦��
		for (a = 1; a < 21; a++) {
			if (a % 2 != 1) {
				System.out.print(a + " ");
			} else { //���࿡ Ȧ�� ���� ��� odd ������ ���������� ���� �߰��ϰ� �˴ϴ�.
				odd += a + " "; //�߰� �� ��� " "�� ������ Ȱ���Ͽ� ������
			}

		}
		System.out.println(odd);

	} // end of main

}
