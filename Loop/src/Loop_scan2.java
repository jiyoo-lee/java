import java.util.Scanner;

public class Loop_scan2 {

	public static void main(String[] args) {
		/* ��ĳ�ʿ� �Բ� while������ ����ڰ� �Է��ϴ�
		 ������ ������ ����� ��µǴ� ���α׷��� �����Ͻÿ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���Ͻô� �������� ���� �Է��ϼ���.>");
		int a = sc.nextInt();
		
		int f = 1; //�ݺ��� �ʱⰪ
		int z; //�ݺ��� ���⿬�� �����
		
		while (f<=9) {
			z = a * f;
			System.out.printf("%d * %d =%d%n",a,f,z);
			f++;
		}
		sc.close();


		
		
		
	}

}
