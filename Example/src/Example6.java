
public class Example6 {

	public static void main(String[] args) {
		/*
		 * ���빮��6 : 1~10���� ���������� �����ϴ� �ݺ����� �ֽ��ϴ�. ��, 1~5������ ��� ���� ���ϰ�, 6~10������ ��� ���� ���մϴ�.
		 * �ش� �ΰ��� ���� ���Ͽ� ���� ���� ū�� ���� ���� ū�� ����� ����Ͻÿ�
		 * 
		 */

		int a;
		int b = 1;
		int c = 0;

		for (a = 1; a <= 10; a++) {
			if (a < 6) {
				b *= a;
			} else {
				c += a;
			}
		}
		if (b > c) {
			System.out.println("���� ���� �� Ů�ϴ�.");
		} else if (b < c) {
			System.out.println("���� ���� �� Ů�ϴ�.");
		} else {
			System.out.println("�� ���� �����ϴ�.");
		}

	}

}
