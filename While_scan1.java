import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {
		
		/* ���빮�� �� �ι��� ������ �ϰ� �˴ϴ�.
		 ����ڰ� ���ڸ� �Է��Ͽ� �� ���� ���� ���ϴ� ��ĳ�ʸ� �����ϼ���   */
		
		Scanner sc = new Scanner(System.in);
		int score; // �� �޴� ����
		int f = 1; // ���ǹ�(��� �ݺ�����)
		int sum = 0; // �հ踦 ������ ����
		
		while (f<3) {
			System.out.print(f+"��°���ڸ� �Է��ϼ���.>");	
			score = sc.nextInt();
			sum += score;
			f++;
		}
		System.out.print("�� ������ ���� "+sum);
		
		sc.close();

	}

}