
public class Double_loop4 {

	public static void main(String[] args) {
		
		/*���빮�� : ���� �ݺ��� (�ۿ��� while �ȿ��� for ���) ���� ���� for + for�� ���� ������.
		 * do while�� ���� ������. 1.do while - > while - > for�� ������ �ӵ��� ������.
		 * ��: for ��: do while*/
		
		/* int f;
		for(f=2; f<=3; f++) {
			int w = 1;
			do {
				System.out.println(f+"*"+w+"="+(f*w));
				w++;
			}while(w<=9);
		} */

		
		/*���빮�� : ������ 7�ܺ��� 9�ܱ��� ��, �� ������ �������� 
		  5������ �������� �մϴ�. 7*1 = 7 ~ 7 * 5 = 35
		  ����(�ۿ��� do while �ȿ��� while) - �򰥸��� ���� ������ �ڵ� § �Ŀ� �־��.
		 */
		
		int dw = 7;
		int total = 1;
		do {
			//System.out.println("====="+dw+"��"+"=====");
			int w = 1;
			while (w<=5) {
				total = dw * w;
				//System.out.println(dw+"*"+w+"="+total);
				w++;
			}
			dw++;
		}while(dw<=9);
		
		
		/*���빮�� : ������ ������� Ȯ���Ͽ� �ڵ带 �ۼ��մϴ�.
		 * ��, for������ �����Ͽ� while������ ���۵ǵ��� �մϴ�.
		 * ��, ���� ū for ���� while��*/
		
		int g;
		int total2 = 1;
		for(g=1; g<=9; g++) {
			
			int y = g;
			while (y<=g) {
				total2 = y * g;
				System.out.println(g+"*"+y+"="+total2);
				y++;
			}
			
		}
		
		
		/*���빮��: ���� �ش� �����ó�� ����� �ǵ��� double �ݺ����� �̿��Ͻÿ�
		 * (while ~ do while�� )
		 * ����� : 1+1 = 2
		 * 1+1 =2 2+2 =4 ~~~ 3+3 = 6 // 4+1=5 4+2=6 4+3 =7 4=4=8 */
		
		
		
	}

}
