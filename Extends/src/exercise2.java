import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		/*���ڸ� �Է��ϸ� �������� ����ǰ� ���� ¦, Ȧ���� �˷��ִ� ����*/
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~9������ ���ڸ� �Է��ϼ���.");
		int number = sc.nextInt();
		
		if(number > 9) {
			System.out.println("���ڸ� �ٽ� Ȯ�����ּ���.");
			System.exit(0);
		}
		else {
			for(int i = 1; i <= 9; i++) {
				sum += number * i;
			}
		}
		
		String msg;
		if(sum%2 == 0) {
			msg = "¦��";
		}
		else {
			msg = "Ȧ��";
		}
		System.out.printf("�� ���� %d�̸� ����� %s�Դϴ�.", sum, msg);
		
		sc.close();
	}

}
