import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
		/*���빮�� : ����ڰ� �� 3���� ���ڸ� �Է��մϴ�.
		 * ������ ���ڸ� ��� ���Ͽ� ����ϼ���.
		 */
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int score = 0;
		long jumsu = 1L;  // long�� �Է½� ���� ������� ���̳ʽ� ������ �߻���.
		
		do {
			System.out.println(a+"��° ���ڸ� �Է��ϼ���.");			
			score = sc.nextInt();
			jumsu *= score ;
			
			a++;
		}while(a<4);

		System.out.println("�����: "+jumsu);
		
		sc.close();
	}

}
