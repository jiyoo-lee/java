import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		/* Example2 Ǯ�� */
		
		Scanner sc = new Scanner(System.in);
		String msg = "�����ܿ� ���� ���ڸ� �Է��ϼ���.";
		String msg2; // �޼��� �κ�
		System.out.println(msg);
		int user = sc.nextInt();
		
		int f = 1;
		int sum = 0;
		
		do { 
			sum += (f * user);
			f++;
		}while(f<10);
		
		//System.out.println(sum);
		if(sum%2 == 0) {
			msg2 = "¦��";
			System.out.printf("������� %s �Դϴ�.", msg2);
		}
		else {
			msg2 = "Ȧ��";
			System.out.printf("������� %s �Դϴ�.", msg2);
		}

		
		sc.close();
	}

}
