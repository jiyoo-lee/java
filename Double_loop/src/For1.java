
public class For1 {

	public static void main(String[] args) {
		/* ������ 2�ܺ��� 3�ܱ����� ������ */

		/*
		 * int a, aa; //�ݺ����� ����� ���� ������ �̸� �Ͽ���.
		 * 
		 * for(a=2; a<4; a++) { //ū for�� -> 2~3������ ȸ��
		 * System.out.println("****"+a+"��***");
		 * 
		 * for(aa=1; aa<10; aa++) { //���� for�� -> 1~9���� ȸ��
		 * 
		 * //�ش� ���� �ݺ����� �۵��Ҷ����� ����� �����. System.out.println(a + "*" + aa); } }
		 */

		/* ���빮�� : ������ 5�ܺ��� 7�ܱ��� ����� �ϵ�, */

		int b, bb;
		int c = 0;

		for (b = 5; b < 8; b++) {
			System.out.println(b + "��");
			for (bb = 1; bb < 5; bb++) {
				System.out.println(b + "*" + bb);
				c += b * bb;
			}
		}
		System.out.println("�հ�:" + c);

	} // end of main

}
