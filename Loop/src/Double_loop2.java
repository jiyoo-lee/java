
public class Double_loop2 {

	public static void main(String[] args) {
		// while double ��

		int w = 1;

		while (w <= 3) {
			int ww = 1;
			while (ww <= 4) { // ���� while���� ū while�� �ۿ� ������ �ʱ�ȭ�� �����ʴ´�. (�ѹ� ���� ����)
								// ���� ���� �ʱ�ȭ�� ū while�� �ȿ��� �������. (do while���� ��������)
				int total = 0;
				total = w + ww;
				System.out.println(w + " + " + ww + " = " + total);
				ww++;
			}
			w++;
		}
		
		
		/* do - while�� */
		
		int dw = 1;
		
		do {
			// do while�� ���� while�� ���� �ʱⰪ�� ū �ݺ��� �ȿ� ���� 
			int ddw = 1;
			do {
				int total2 = 0;
				total2 = dw+ddw;
				System.out.println(dw+" + "+ddw+" = "+total2);
				ddw++; // ++ �������ʱ�
			}while(ddw<=4); //���� �ݺ��� ����
			dw++; // + �������ʱ�
		}while(dw<=3); //ū �ݺ��� ����

	}

}
