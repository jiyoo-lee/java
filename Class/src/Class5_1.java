import java.util.Scanner;

public class Class5_1 {
	/* ���빮�� for_in�̶�� �Ϲ� �޼ҵ�(�޸�)�� �ֽ��ϴ�.
	 * ���α׷� ����� ������ ���� ������ �մϴ�.
	 * "����Ͻ� ������ ���ڸ� �ϳ� �Է����ּ���:"
	 * [���] - �ش� �޼ҵ忡�� ����� ����ؾ���. */
	 // ���� ����ڰ� 3���� �Է½� 3 * 1 = 3 ...3 * 9 =27 ��µǾ����
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���Ͻô� �������� �Է��ϼ���.");
		int gugu = sc.nextInt();
		
		users.for_in(gugu);
		sc.close(); //��ĳ�� Ŭ����� ���ο� �Ѵ�.
	}

}

class users {
	
	public static void for_in(int a) {
		for(int i =1; i<=9; i++) {
			System.out.printf(" %d * %d = %d%n", a, i,(a*i));
		}
		
	}
}
