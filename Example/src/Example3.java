import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {

		/*
		 * ���빮�� : ����ڰ� �ش� ���� �Է��մϴ�. ��, ����ڰ� 2���� ���ڸ� �Է��ϵ� ù��° ���ڿ� �ι�° ���� ���� �ȿ� �ִ� ��� ���ڸ�
		 * ���ؼ� ��� ���� �������� �����Ͻÿ� ��, �ش� �ڵ�� do while ������ �ۼ��մϴ�.
		 * 
		 * ���� : ù��° ���� ���ڴ�? 5 �ι�° ���� ���ڴ�? 10 ���� ���� ��� �հ�� 45�Դϴ�.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� ���ڴ�?");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ���� ���ڴ�?");
		int num2 = sc.nextInt(); //��ĳ�� �ϳ��� �ι� ���� �޴´�.
		int sum = 0;

		do {
			sum += num1; 
			num1++;
		} while (num1 <= num2);

		System.out.println(sum + "�Դϴ�.");
		sc.close();
	}

}
