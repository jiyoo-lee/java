import java.util.Scanner;

public class For_scan1 {

	public static void main(String[] args) {
		/* int a = 5;
		System.out.println(a++);
		System.out.println(++a); -++�� ��ġ�� ���� ���� �޶����� 

		int b = 10;
		int c = 10;
		int d = b + ++c; // 21�� �����ϰ� ��� 
		// d = b + c++; // 20 ����ϰ� 1 ���ؼ� ������ ������ �־� ���� ��궧 21�� ���� �Ǿ���.
		System.out.println(d);*/
		
		Scanner sc = new Scanner(System.in); //�Է� ����
		int f; //�ݺ���
		int sum = 0; // ����ڰ� �Է��� ���� ���� �հ�
		int score; // ����� �Է�
		
		for (f =1; f<4; f++) {
			System.out.print("������ �Է����ּ���.>");
			score = sc.nextInt(); //����ڰ� �Է��� ��
			sum += score; //����ڰ� �Է��� ���� �հ� ������ �̰�
		}
		System.out.println("�� ������ ����: "+sum); //�հ� ���
		
		sc.close(); //���� ����.
	}

}
