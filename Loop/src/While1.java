
public class While1 {

	public static void main(String[] args) {
		// �ݺ������� String ������ ����.

		int a = 1; // ���� �ְ� ���� while ���۰�
		while (a < 11) { // while ���� ��, ���ᰪ (=���� ����� ����)

			// System.out.print(a+",");

			a++; // ������
		}

		int b = 10;
		while (b > 4) {
			// System.out.print(b + ",");
			b--;
		}

		/*
		 * ���빮�� ���� ������ while������ �ۼ��Ͻÿ�. 22~16���� ���ڸ� ����ϼ���
		 */

		int c = 22;
		while (c > 15) {
			// System.out.print(c + ",");
			c--;
		}

		/*
		 * ���빮�� ���ᰪ�� ������ �޾Ƽ� ����
		 */

		int aa = 1; // �ʱⰪ
		int bb = 10; // ������ ������ �����ؼ� Ǯ���ϴ� ���(�ǹ����� ���� ����.)

		while (aa <= bb) { // �ݺ�����

			// System.out.printf("%d ", aa);
			aa++; // ������
		}

		/*
		 * ���빮�� ���� 2���� �̿��Ͽ� ������ �°� ���� ����Ͻÿ�. 99~47����
		 */

		int cc = 99;
		int dd = 46;

		while (cc > dd) {
			//System.out.printf("%d ", cc);
			cc--;
		}

	} // end of main

}
